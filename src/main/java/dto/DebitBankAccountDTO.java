package dto;

public class DebitBankAccountDTO extends AccountDTO {

    public String iban;
    public DebitBankAccountDTO(String id, String amount, String ownerID,String iban) {
        super(id, amount, ownerID);
        this.iban= iban;
    }
}
