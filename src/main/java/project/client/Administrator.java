package project.client;


import project.dto.AccountDTO;

public class Administrator extends Client {

    private AccountDTO account;


    public Administrator(long id,String username, String password, String uniqueId, String flag) {
        super(id,username,password,uniqueId,flag);

    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account=account;
    }

}
