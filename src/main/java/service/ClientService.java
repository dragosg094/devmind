package service;

import cache.ClientCache;
import cache.TransactionCache;
import dto.DebitBankAccountDTO;
import dto.AccountDTO;
import dto.Transaction;

import java.util.List;

public class ClientService {
    private AccountService accountService;
    private TransactionCache transactionCache;


    public ClientService(AccountService accountService, TransactionCache transactionCache) {

        this.accountService = accountService;
        this.transactionCache = transactionCache;
    }


    public double returnAmount(DebitBankAccountDTO debitBankAccountDTO) {
        return 0;
    }

    public List<AccountDTO> returnAccount(String userName) {
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
