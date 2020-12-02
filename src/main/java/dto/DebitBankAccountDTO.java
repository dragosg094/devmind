package dto;

public class DebitBankAccountDTO extends AccountDTO {

    private String iban;
    private  static long counter = 0L;

    public DebitBankAccountDTO(long id, Double amount, String ownerID,String iban) {
        super(id, amount, ownerID);
        this.iban= iban;
        setId(counter++);
    }

    @Override
    public void increaseAmount(Double amount) {
        Double newAmount = getAmount()+amount;
        setAmount(newAmount);
    }

    @Override
    public long getBankAccountID() {

        return getId();
    }

    @Override
    public String getIban() {

        return iban;
    }

    @Override
    public String toString() {
        return "DebitBankAccountDTO{" +
                "iban='" + iban + '\'' + " amount= "+getAmount() +" id= " + getId()+
                '}';
    }
}
