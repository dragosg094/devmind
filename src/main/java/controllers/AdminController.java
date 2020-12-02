package controllers;

import client.Client;
import dto.AccountDTO;
import service.AdminService;

public class AdminController {

    private AdminService adminService = new AdminService();

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    public void createNewClient(Client client) {
        adminService.createNewClient(client);
    }

    public AccountDTO createNewDebitBankAccount(Client client) {
        return adminService.createNewDebitBankAccount(client);
    }
    public AccountDTO createNewCreditBankAccount(Client client) {
        return adminService.createNewCreditBankAccount(client);
    }

}
