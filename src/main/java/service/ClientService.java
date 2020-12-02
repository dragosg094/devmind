package service;

import cache.ClientCache;
import cache.TransactionCache;
import dto.DebitBankAccountDTO;
import dto.AccountDTO;
import dto.Transaction;

import java.util.List;

public class ClientService {
    private AccountService accountService;
    private ClientCache clientCache;


    public ClientService(AccountService accountService, ClientCache clientCache) {

        this.accountService = accountService;
        this.clientCache = clientCache;
    }



    public double returnAmount(DebitBankAccountDTO debitBankAccountDTO) {
        return 0;
    }

    public List<AccountDTO> returnAccount(String userName) {
       return null;
    }

    public void transferAmountByIban(String iban, Double amount) {
    accountService.transferAmountByIban(iban, amount);
    }

    public void transferAmountToAccount(AccountDTO accountDTO, Double amount) {
        accountService.transferAmountToAccount(accountDTO, amount);
    }

    public TransactionCache showAllTransactions() {
        return null;
    }
}
