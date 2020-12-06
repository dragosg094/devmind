package service;

import cache.AccountsCache;
import cache.ClientCache;
import cache.TransactionCache;
import client.Client;
import dto.DebitBankAccountDTO;
import dto.AccountDTO;
import dto.Transaction;

import java.util.List;

public class ClientService {
    private AccountService accountService;
    private TransactionCache transactionCache;
    private AccountsCache accountsCache;
    private ClientCache clientCache;


    public ClientService(AccountService accountService, TransactionCache transactionCache, AccountsCache accountsCache) {

        this.accountService = accountService;
        this.transactionCache = transactionCache;
        this.accountsCache = accountsCache;

    }


    public double returnAmount(DebitBankAccountDTO debitBankAccountDTO) {

        return debitBankAccountDTO.getAmount();
    }

    public AccountDTO returnAccount(String userName) {

        Client client = clientCache.getClientByUsername(userName);

        for (AccountDTO accountDTO : accountsCache.getAccountsList()) {
            if (accountDTO.getOwnerID().equals(client.getUniqueId())) {
                return accountDTO;
            }
        }
        return null;

    }

    public void transferAmountByIban(long iban, Double amount) {

        accountService.transferAmountByIban(iban, amount);
    }

    public void transferAmountToAccount(AccountDTO accountDTO, Double amount) {
        accountService.transferAmountToAccount(accountDTO, amount);
    }

    public List<Transaction> showAllTransactions() {
        return transactionCache.getAllTransactions();
    }
}
