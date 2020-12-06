package project.client;

import project.dto.AccountDTO;
import lombok.Getter;


public class ClientLegalPerson extends Client {

    @Getter
    private String companyName;
    @Getter
    private int costTranzactie;
    @Getter
    private final String CUI;
    private AccountDTO account;

    public ClientLegalPerson(long id,String companyName, String username, String password, int costTranzactie, String uniqueId, String flag, String CUI) {
       super(id, username, password,uniqueId, flag);
       this.companyName = companyName;
        this.costTranzactie = costTranzactie;
        this.CUI = CUI;
    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account=account;
    }

}
