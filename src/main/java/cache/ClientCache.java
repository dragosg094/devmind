package cache;

import client.Client;
import dto.Transaction;

import java.util.List;

public class ClientCache extends Cache{

    @Override
    public boolean isLogged(Client client) {
        return false;
    }

    @Override
    public void addTransaction(Transaction newCreditTransaction) {

    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }
}
