package dto;

public class CreditBankAccountDTO extends AccountDTO {

    private String limitAccount;

    public CreditBankAccountDTO(String id, String amount, String ownerID, String limitAccount) {
        super(id, amount, ownerID);
        this.limitAccount = limitAccount;
    }
}
