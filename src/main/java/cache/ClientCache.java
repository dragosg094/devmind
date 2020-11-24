package cache;

import client.Client;

public class ClientCache extends Cache{

    @Override
    public boolean isLogged(Client client) {
        return false;
    }
}
