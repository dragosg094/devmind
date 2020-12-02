package cache;

import client.Client;
import dto.Transaction;

import java.util.ArrayList;
import java.util.List;

public abstract class Cache {
    List<Client> client = new ArrayList<>();

    public boolean isLogged(Client client){
        return true;
    }

    public abstract void addTransaction(Transaction newCreditTransaction);

    public abstract List<Client> getAllClients();
}
