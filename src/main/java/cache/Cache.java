package cache;

import client.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class Cache {
    List<Client> client = new ArrayList<>();

    public boolean isLogged(Client client){
        return true;
    }
}
