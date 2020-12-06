package service;

import cache.AccountsCache;
import cache.TransactionCache;
import dto.AccountDTO;
import dto.Transaction;


public class AccountService {

    private TransactionCache transactionCache;
    private Transaction transaction;
    private AccountsCache cache;

    public AccountService(AccountsCache cache, TransactionCache transactionCache) {
        this.cache = cache;
        this.transactionCache = transactionCache;
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

    public AccountDTO getAccountByIban(long iban) {
        cache.addAllAccounts();
       for(AccountDTO account : cache.getAccountsList()){
           if(account.getIban() == iban){
               addTransactionToRepository(account);
               return account;
           }
       }
        return null;
    }

    public void transferAmountByIban(long iban, Double amount) {
        cache.addAllAccounts();
        for(AccountDTO account : cache.getAccountsList()){
            if(account.getIban() == iban){
                account.increaseAmount(amount);
                addTransactionToRepository(account);
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
