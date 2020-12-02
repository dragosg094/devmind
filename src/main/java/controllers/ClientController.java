package controllers;

import cache.TransactionCache;
import dto.DebitBankAccountDTO;
import dto.AccountDTO;
import dto.Transaction;
import service.AccountService;
import service.ClientService;

import java.util.List;

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService, AccountService accountService) {
        this.clientService = clientService;
    }

    public List<AccountDTO> getAllAccounts(String userName){
        return this.clientService.returnAccount(userName);
    }

    public double showAmount(DebitBankAccountDTO debitBankAccountDTO){
        return this.clientService.returnAmount(debitBankAccountDTO);
    }

    public void transferAmountByIban(String iban, Double amount){
        this.clientService.transferAmountByIban(iban,amount);
    }
    public void transferAmountToAccount(AccountDTO accountDTO, Double amount){
        this.clientService.transferAmountToAccount(accountDTO, amount);
    }
    public TransactionCache showAllTransactions(){
       return this.clientService.showAllTransactions();
    }
}
