package client;

import dto.AccountDTO;
import lombok.Getter;


public class ClientJuridicPerson extends Client {

    @Getter
    private String companyNamed;
    @Getter
    private int costTranzactie;
    @Getter
    private final String CUI;
    private AccountDTO account;

    public ClientJuridicPerson(String companyName, String username, String password, int costTranzactie, String uniqueId, String flag,String CUI) {
       super( username, password,uniqueId, flag);
       this.companyName = companyName;
        this.costTranzactie = costTranzactie;
        this.CUI = CUI;
    }

    @Override
    public void setAccount(AccountDTO account) {
        this.account=account;
    }
}
