package org.example;

public class IncomeTaxDept {

    public Tax getTaxAmountByType(Transaction transaction, String type) {
        if (type.equalsIgnoreCase("CGST")) {
            return new Tax("Central TaxVal", transaction.getAmount() + 10);
        }
        if (type.equalsIgnoreCase("SGST")) {
            return new Tax("State TaxVal", transaction.getAmount() + 20);
        }
        return null;
    }
}
