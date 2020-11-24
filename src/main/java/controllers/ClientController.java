package controllers;

import dto.DebitBankAccountDTO;
import dto.AccountDTO;
import service.AccountService;
import service.ClientService;

import java.util.List;

public class ClientController {
    private ClientService clientService;
    private AccountService accountService;

    public ClientController(ClientService clientService, AccountService accountService) {
        this.clientService = clientService;
        this.accountService = accountService;
    }

    public List<AccountDTO> getAllAccounts(String userName){
        return this.clientService.returnAccount(userName);
    }
    public double showAmount(DebitBankAccountDTO debitBankAccountDTO){
        return this.clientService.returnAmount(debitBankAccountDTO);
    }
}
