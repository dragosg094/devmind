package service;

import cache.ClientCache;
import cache.TransactionCache;
import client.Client;
import dto.AccountDTO;
import dto.DebitBankAccountDTO;
import dto.Transaction;

import java.util.List;

public class AccountService {

    private ClientCache clientCache;
    private TransactionCache transactionCache;
    private List<Client> allClients;
    private Transaction transaction;

    public AccountService(ClientCache clientCache, TransactionCache transactionCache) {
        this.clientCache = clientCache;
        this.transactionCache = transactionCache;
        this.allClients = clientCache.getAllClients();
    }

    public Transaction creditAccount(AccountDTO accountDTO, Double amount) {
        accountDTO.increaseAmount(amount);
        addTransactionToRepository(accountDTO);
        return transaction;
    }
    public Transaction debitAccount(AccountDTO accountDTO, Double amount) {
        accountDTO.increaseAmount(amount);
        addTransactionToRepository(accountDTO);
        return transaction;
    }

    public AccountDTO getAccountByIban(String iban) {
        for (Client currentClient : allClients) {
            List<AccountDTO> allAccountsOfCurrentClient = currentClient.getAccounts();
            for (AccountDTO currentAccount : allAccountsOfCurrentClient) {
                if (currentAccount.getIban() == iban) {
                    return currentAccount;
                }
            }
        }
        return null;
    }

    public void transferAmountByIban(String iban, Double amount) {
        for(Client currentClient : allClients){
            List<AccountDTO> allAccountsOfCurrentClient = currentClient.getAccounts();
            for (AccountDTO currentAccount : allAccountsOfCurrentClient) {
                if (currentAccount.getIban() == iban) {
                   currentAccount.increaseAmount(amount);
                    addTransactionToRepository(currentAccount);
                }
            }
        }
    }

    public void transferAmountToAccount(AccountDTO accountDTO, Double amount) {
        accountDTO.increaseAmount(amount);
        addTransactionToRepository(accountDTO);
    }

    private void addTransactionToRepository(AccountDTO accountDTO) {
        transaction = new Transaction(accountDTO);
        transactionCache.addTransaction(transaction);
    }
}
