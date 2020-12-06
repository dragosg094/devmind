package project.controllers;

import project.dto.AccountDTO;
import project.dto.DebitBankAccountDTO;
import project.dto.Transaction;
import project.service.AccountService;
import project.service.ClientService;

import java.util.List;

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService, AccountService accountService) {
        this.clientService = clientService;
    }

    public AccountDTO getAllAccounts(String userName){
        return this.clientService.returnAccount(userName);
    }

    public double showAmount(DebitBankAccountDTO debitBankAccountDTO){
        return this.clientService.returnAmount(debitBankAccountDTO);
    }

    public void transferAmountByIban(long iban, Double amount){
        this.clientService.transferAmountByIban(iban,amount);
    }
    public void transferAmountToAccount(AccountDTO accountDTO, Double amount){
        this.clientService.transferAmountToAccount(accountDTO, amount);
    }
    public List<Transaction> showAllTransactions(){
       return this.clientService.showAllTransactions();
    }
}
