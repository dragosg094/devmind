package project.controllers;

import project.client.Client;
import project.service.LoginService;

public class LoginController {

    private Client client;
    private LoginService loginService;

    public LoginController(Client client, LoginService loginService) {
        this.client = client;
        this.loginService = loginService;
    }

    public void checkClientID(Client client) {
        if (client.getFlag().equals("client")) {
            loginClient();
        } else {
            loginAdmin();
        }
    }

    public void loginClient() {
        loginService.checkClient(client);
    }

    public void loginAdmin() {

        loginService.checkAdmin(client);
    }
}