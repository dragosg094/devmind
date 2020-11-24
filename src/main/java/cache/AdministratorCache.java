package cache;

import client.Client;

public class AdministratorCache extends Cache{
    @Override
    public boolean isLogged(Client client) {
        return true;
    }
}
