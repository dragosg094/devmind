package service;

import client.Client;
import client.ClientJuridicPerson;
import client.ClientPerson;

public class AdminService {
    private Client client;


    public Client createNewPersonClient(String nume, String prenume, String username, String password , String uniqueId, String flag, String CNP){
        client = new ClientPerson(username, password, uniqueId,flag,CNP ,nume,prenume);
        return client;
    }
    public Client createNewJuridicClient(String companyName, String username, String password, int costTranzactie, String uniqueId, String flag,String CUI){
        client = new ClientJuridicPerson(companyName,username,password,costTranzactie,uniqueId,flag, CUI);
        return client;
    }
}
