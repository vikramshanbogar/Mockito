package org.example;

import java.util.Date;

public class Transaction {

    private int id;
    private int amount;
    private String description;
    private Date createdAt;

    Tax tax;

    public Transaction(int id, int amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.createdAt = new Date();
    }

    public Transaction(int id, int amount, String description, Tax tax) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.createdAt = new Date();
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
