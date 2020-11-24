package client;


import dto.AccountDTO;
import lombok.Getter;

public class Administrator extends Client {
    @Getter
    private final String uniqueId;
    private AccountDTO account;

    public Administrator(String nume, String prenume, String username, String password, String uniqueId, String flag) {
        super(nume, prenume, username, password ,uniqueId, flag);
        this.uniqueId = uniqueId;
    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account=account;
    }

}
