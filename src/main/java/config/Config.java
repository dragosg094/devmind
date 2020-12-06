package config;

import cache.AccountsCache;
import cache.TransactionCache;
import controllers.AdminController;
import controllers.ClientController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.AccountService;
import service.AdminService;
import service.ClientService;

@Configuration
@ComponentScan()
public class Config {

    @Bean
    public AdminController adminController(){
        return new AdminController(adminService());
    }

    @Bean
    public ClientController clientController(){
        return new ClientController(clientService(),accountService());
    }

    @Bean
    public AdminService adminService(){
        return new AdminService();
    }

    @Bean
    public ClientService clientService(){
        return new ClientService(accountService(),transactionCache(),accountsCache());
    }
    @Bean
    public AccountService accountService(){
        return new AccountService(accountsCache(),transactionCache());
    }
    @Bean
    public AccountsCache accountsCache(){
        return new AccountsCache();
    }
    @Bean
    public TransactionCache transactionCache(){
        return new TransactionCache();
    }
}
