package service;

import cache.ClientCache;
import client.Client;
import customExceptions.WrongPasswordException;


public class LoginService {
    private ClientCache clientCache;

    public LoginService(ClientCache clientCache) {
        this.clientCache = clientCache;
    }

    public void checkClient(Client client){
        if(clientCache.isClient(client.getUsername())){
             loginClient(client);
        }else{
            clientCache.addClient(client);
            loginClient(client);
        }
    }
    public void checkAdmin(Client client){
        if(clientCache.isClient(client.getUsername())){
            loginAdmin(client);
        }else{
            clientCache.addClient(client);
            loginAdmin(client);
        }
    }
    public void loginClient(Client client){
       if(isPasswordCorrect(client)){
           System.out.println("Login successful!");
        }else{
           throw new WrongPasswordException();
       }
    }

    private boolean isPasswordCorrect(Client client) {
        return clientCache.getClientByUsername(client.getUsername()).getPassword().equals(client.getPassword());
    }

    public void loginAdmin(Client client) {

        if(isPasswordCorrect(client)){
            System.out.println("Login successful!");
        }else{
            throw new WrongPasswordException();
        }
    }
}