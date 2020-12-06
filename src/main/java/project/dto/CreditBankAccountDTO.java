package project.dto;


import project.cache.AccountsCache;
import project.client.Client;
import project.customExceptions.InsufficientFundsException;
import lombok.Getter;

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

