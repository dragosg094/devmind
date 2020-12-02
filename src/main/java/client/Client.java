package client;

import dto.AccountDTO;
import dto.DebitBankAccountDTO;
import lombok.Data;
import lombok.Getter;

import java.util.List;

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

    public abstract List<AccountDTO> getAccounts();
}
