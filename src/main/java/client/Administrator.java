package client;


import dto.AccountDTO;
import dto.DebitBankAccountDTO;
import lombok.Getter;

import java.util.List;

public class Administrator extends Client {

    private AccountDTO account;

    public Administrator(String username, String password, String uniqueId, String flag) {
        super(username,password,uniqueId,flag);

    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account=account;
    }

    @Override
    public List<AccountDTO> getAccounts() {
        return null;
    }


}
