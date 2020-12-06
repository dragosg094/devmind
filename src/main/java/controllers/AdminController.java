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

    public AccountDTO createNewDebitBankAccount(Client client,Double amount) {
        return adminService.createNewDebitBankAccount(client, amount);
    }
    public AccountDTO createNewCreditBankAccount(Client client,Double amount, Double limitAmount) {
        return adminService.createNewCreditBankAccount(client, amount, limitAmount);
    }

}
