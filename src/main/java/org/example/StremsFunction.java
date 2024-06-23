package org.example;

import java.util.function.Function;

public class StremsFunction {

    public static void main(String[] args) {
        Function<Integer,Integer> function1 = x->x*2;
        Function<Integer,Integer> function2 = x->x*3;
        System.out.println(function1.apply(3));
        System.out.println(function1.andThen(function2).apply(4));
        System.out.println(function2.andThen(function1).apply(5));

        Function<Transaction,Integer> taxCalc = t->t.getAmount()+t.tax.getTaxAmt();
        System.out.println(taxCalc.apply(new Transaction(7,200,"milk",new Tax("CGST",200))));
    }

}
