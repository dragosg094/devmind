package project.cache;

import project.client.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientCache {

    private static final List<Client> clientList = new ArrayList<>();

    public void addClient(Client client){
        for(Client c : clientList){
            if(client.getUsername().equals(c.getUsername())){
                System.out.println("The username already exists!");
            }
        }
                clientList.add(client);
                System.out.println("Client with username "+ client.getUsername()+ " was added successfully!");
    }

    public void removeClient(Client client){
        for(Client c: clientList){
            if(client.getUsername().equals(c.getUsername())){
                clientList.remove(c);
                System.out.println("The client was successfully removed from the list!");
            }
        }
        System.out.println("The client was not in the list!");

    }

    public boolean isClient(String username){
        for (Client c: clientList){
            if (c.getUsername().equals(username)){
                return true;
            }
        }
        System.out.println("The client was not in the list!");
        return false;
    }
    public Client getClientByUsername(String username){
        for (Client c: clientList){
            if (c.getUsername().equals(username)){
                return c;
            }
        }
        System.out.println("The client was not in the list!");
        return null;
    }

    public List<Client> getAllClients() {
        System.out.println("Number of clients: " + this.clientList.size());
        return clientList;

    }
}