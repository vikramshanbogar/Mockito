package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Operations {

    IncomeTaxDept incomeTaxDept;

    public Operations(IncomeTaxDept incomeTaxDept) {
        this.incomeTaxDept = incomeTaxDept;
    }

    public IncomeTaxDept getIncomeTaxDept() {
        return incomeTaxDept;
    }

    public void setIncomeTaxDept(IncomeTaxDept incomeTaxDept) {
        this.incomeTaxDept = incomeTaxDept;
    }

    public static List<Transaction> getTransactionsList() {
        return transactionsList;
    }

    public static void setTransactionsList(List<Transaction> transactionsList) {
        Operations.transactionsList = transactionsList;
    }



    public static List<Transaction> transactionsList = new ArrayList<>();

    static {
        transactionsList.add(new Transaction(1, 1000, "dmart"));
        transactionsList.add(new Transaction(2, 2000, "zudio"));
        transactionsList.add(new Transaction(3, 3000, "bigBazzar"));
        transactionsList.add(new Transaction(4, 4000, "eggBazzar"));
        transactionsList.add(new Transaction(5, 5000, "zomato"));
    }

    public List<Transaction> OnCOndition(Predicate<Transaction> predicate) {
        return transactionsList.stream().filter(predicate).collect(Collectors.toList());
    }

    public int getTotalTransactionsAmount() {
        return transactionsList.stream().mapToInt(p -> p.getAmount()).sum();
    }

    public int getTotalTransactionsAmountWithTax(Transaction transaction) {
        Tax tax = incomeTaxDept.getTaxAmountByType(transaction, "CGST");
        int transactionAmount = transaction.getAmount();
        return transactionAmount + tax.getTaxAmt();
    }

}
