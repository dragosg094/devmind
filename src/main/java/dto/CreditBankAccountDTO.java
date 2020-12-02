package dto;


import customExceptions.InsufficientFundsException;
import lombok.Getter;
import org.iban4j.CountryCode;
import org.iban4j.Iban;

import java.util.Random;

public class CreditBankAccountDTO extends AccountDTO {

    @Getter
    private Double limitAmount;
    private static long counter = 0L;
    private Iban iban;


    public CreditBankAccountDTO(long id, Double amount, String ownerID, Double limitAmount) {
        super(id, amount, ownerID);
        this.limitAmount = limitAmount;
       setId(counter++);
    }

    public void increaseAmount(Double amount){
        Double newAmount = getAmount() +amount;
        setAmount(newAmount);
    }

    @Override
    public long getBankAccountID() {
        return getId();
    }

    public void setIban(String bankCode,String accountNumber){
        iban = new Iban.Builder()
                .countryCode(CountryCode.RO)
                .bankCode(bankCode)
                .accountNumber(accountNumber).build();
    }

    public void decreaseAmount(Double amount) throws InsufficientFundsException {
        if(getAmount()>=amount){
            Double newAmount = getAmount() -amount;
            setAmount(newAmount);
        }else{
            throw new InsufficientFundsException();
        }
    }
}

