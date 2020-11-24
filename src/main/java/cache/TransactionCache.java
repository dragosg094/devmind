package cache;

import client.Client;

public class TransactionCache extends Cache {
    @Override
    public boolean isLogged(Client client) {
        return false;
    }
}
