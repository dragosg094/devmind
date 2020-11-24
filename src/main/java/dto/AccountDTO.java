package dto;

import lombok.Data;

@Data
public abstract class AccountDTO {
    public String id;
    public String amount;
    public String ownerID;

    public AccountDTO(String id, String amount, String ownerID) {
        this.id = id;
        this.amount = amount;
        this.ownerID = ownerID;
    }
}
