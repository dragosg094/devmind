package service;

import client.Client;
import client.ClientLegalPerson;
import client.ClientPerson;
import dto.AccountDTO;
import dto.DebitBankAccountDTO;

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
        if (!client.getFlag().equals("legal")){
            createNewLegalClient(client);
        }else if(!client.getFlag().equals("admin")){
            System.out.println("Please insert a client or a legal client");
        }else{
            createNewPersonClient(client);
        }
    }

    public AccountDTO createNewDebitBankAccount(Client client) {
        //return new DebitBankAccountDTO(client.getId(),, client.getUniqueId(),);
    }

    public AccountDTO createNewCreditBankAccount(Client client) {

    }
}
