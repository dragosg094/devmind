package dto;


import cache.AccountsCache;
import client.Client;

import java.util.Random;

public class DebitBankAccountDTO extends AccountDTO {
    private Random random = new Random();
    private long iban ;
    private static long counter = 0L;
    private AccountsCache accountsCache;

    public DebitBankAccountDTO(long id, Double amount, String ownerID) {
        super(id, amount, ownerID);
        this.iban = random.nextInt(33);
        setId(counter++);
        accountsCache =new AccountsCache();
    }

    @Override
    public void increaseAmount(Double amount) {
        Double newAmount = getAmount() + amount;
        setAmount(newAmount);
    }

    @Override
    public void addAccount(Client client) {
        accountsCache.addDebitAccount(new DebitBankAccountDTO(client.getId(), getAmount(),getOwnerID()));
    }

    @Override
    public Long getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "DebitBankAccountDTO{" +
                "iban='" + iban + '\'' + " amount= " + getAmount() + " id= " + getId() +
                '}';
    }
}
