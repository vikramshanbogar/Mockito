package org.example;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println(operations.OnCOndition(p -> p.getAmount() > 4000));
    }
}