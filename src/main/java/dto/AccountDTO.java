package dto;

import client.Client;
import lombok.Data;


@Data
public abstract class AccountDTO {
    private long id;
    private Double amount;
    private String ownerID;
    private Long iban;

    public AccountDTO(long id, Double amount, String ownerID) {
        this.id = id;
        this.amount = amount;
        this.ownerID = ownerID;
    }

    public abstract void increaseAmount(Double amount);
    public abstract void addAccount(Client client);
}
