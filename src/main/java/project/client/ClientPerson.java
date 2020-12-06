package project.client;

import project.dto.AccountDTO;
import lombok.Getter;

public class ClientPerson extends Client{

    @Getter
    private String nume;
    @Getter
    private String prenume;
    @Getter
    private final String CNP;
    private AccountDTO account;

    public ClientPerson(long id, String username, String password , String uniqueId,String flag, String CNP,String nume, String prenume) {
        super(id,username,password, uniqueId, flag);
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account = account;
    }

}
