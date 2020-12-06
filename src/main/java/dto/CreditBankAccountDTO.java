package dto;


import cache.AccountsCache;
import client.Client;
import customExceptions.InsufficientFundsException;
import lombok.Getter;
import org.iban4j.CountryCode;
import org.iban4j.Iban;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreditBankAccountDTO extends AccountDTO {

    @Getter
    private Double limitAmount;
    private static long counter = 0L;
    private Random random = new Random();
    private long iban;
    private AccountsCache accountsCache;



    public CreditBankAccountDTO(long id, Double amount, String ownerID, Double limitAmount) {
        super(id, amount, ownerID);
        this.limitAmount = limitAmount;
        this.iban = random.nextInt(33);
        setId(counter++);

    }

    public void increaseAmount(Double amount) {
        Double newAmount = getAmount() + amount;
        setAmount(newAmount);
    }

    @Override
    public void addAccount(Client client) {
        accountsCache.addCreditAccount(new CreditBankAccountDTO(client.getId(),getAmount(),getOwnerID(),limitAmount));
    }

    public void decreaseAmount(Double amount) throws InsufficientFundsException {
        if (getAmount() >= amount) {
            Double newAmount = getAmount() - amount;
            setAmount(newAmount);
        } else {
            throw new InsufficientFundsException();
        }
    }

    @Override
    public String toString() {
        return "CreditBankAccountDTO{" +
                "limitAmount=" + limitAmount +
                ", random=" + random +
                ", iban=" + iban +
                ", accountsCache=" + accountsCache +
                '}';
    }
}

