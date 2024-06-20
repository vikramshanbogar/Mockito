package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Operations operations = new Operations(null);
//        System.out.println(operations.OnCOndition(p -> p.getAmount() > 4000));


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(32);
        set.add(54);
        set.add(31);
        set.add(4);
        System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(32);
        linkedHashSet.add(54);
        linkedHashSet.add(31);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(32);
        treeSet.add(54);
        treeSet.add(31);
        treeSet.add(4);
        System.out.println(treeSet);


    }
}