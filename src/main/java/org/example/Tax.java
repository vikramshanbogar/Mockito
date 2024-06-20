package org.example;

public class Tax {

    int id;
    String name;
    int transactionAmt;
    int taxAmt;

    public Tax(String name, int transactionAmt) {
        this.name = name;
        this.transactionAmt = transactionAmt;
        this.taxAmt = (transactionAmt * 10) / 100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransactionAmt() {
        return transactionAmt;
    }

    public void setTransactionAmt(int transactionAmt) {
        this.transactionAmt = transactionAmt;
    }

    public int getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(int taxAmt) {
        this.taxAmt = taxAmt;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transactionAmt=" + transactionAmt +
                ", taxAmt=" + taxAmt +
                '}';
    }
}
