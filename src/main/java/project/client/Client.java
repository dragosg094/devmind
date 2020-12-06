package project.client;

import project.dto.AccountDTO;
import lombok.Data;

@Data
public abstract class  Client {
    private String username;
    private String password;
    private final String uniqueId;
    private final String flag;
    private long id;



    public Client( long id,String username, String password,String uniqueId,String flag) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.uniqueId = uniqueId;
        this.flag=flag;
    }


    public abstract void setAccount(AccountDTO account);

}
