package project.cache;

import project.dto.AccountDTO;


import java.util.ArrayList;
import java.util.List;

public class AccountsCache  {

    private static List<AccountDTO> creditAccounts = new ArrayList<>();
    private static List<AccountDTO> debitAccounts = new ArrayList<>();
    private List<AccountDTO> allAccounts = new ArrayList<>();


    public void addCreditAccount(AccountDTO accountDTO){
        creditAccounts.add(accountDTO);
    }
    public void addDebitAccount(AccountDTO accountDTO){
        debitAccounts.add(accountDTO);
    }
    public List<AccountDTO> addAllAccounts(){
        allAccounts.addAll(creditAccounts);
        allAccounts.addAll(debitAccounts);
        return allAccounts;
    }
    public List <AccountDTO> getAccountsList(){
        return  allAccounts;
    }



}
