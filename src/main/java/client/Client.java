package client;

import dto.AccountDTO;
import lombok.Data;
import lombok.Getter;

@Data
public abstract class  Client {
    private String username;
    private String password;
    private final String uniqueId;
    private final String flag;


    public Client( String username, String password,String uniqueId,String flag) {
        this.username = username;
        this.password = password;
        this.uniqueId = uniqueId;
        this.flag=flag;
    }

    public abstract void setAccount(AccountDTO account);
}
