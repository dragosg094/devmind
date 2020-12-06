package project.service;

import project.client.Client;
import project.dto.AccountDTO;
import project.dto.CreditBankAccountDTO;
import project.dto.DebitBankAccountDTO;

public class AdminService {
    private Client client;


    public Client createNewPersonClient(Client clientPerson) {
        client = clientPerson;
        return client;
    }

    public Client createNewLegalClient(Client legalPerson) {
        client = legalPerson;
        return client;
    }

    public void createNewClient(Client client) {
        if (!client.getFlag().equals("legal")) {
            createNewLegalClient(client);
        } else if (!client.getFlag().equals("admin")) {
            System.out.println("Please insert a client or a legal client");
        } else {
            createNewPersonClient(client);
        }
    }

    public AccountDTO createNewDebitBankAccount(Client client, Double amount) {
        return new DebitBankAccountDTO(client.getId(), amount, client.getUniqueId());
    }

    public AccountDTO createNewCreditBankAccount(Client client, Double amount, Double limitAmount) {
        return new CreditBankAccountDTO(client.getId(), amount, client.getUniqueId(), limitAmount);
    }
}
