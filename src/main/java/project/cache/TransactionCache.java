package project.cache;

import project.dto.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionCache {

    public static final List<Transaction> transactionList = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }


    public List<Transaction> getAllTransactions() {
        System.out.println("The number of transactions are: "+ transactionList.size());
        return transactionList;
    }
}
