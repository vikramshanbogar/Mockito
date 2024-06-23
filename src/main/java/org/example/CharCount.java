package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {

    //Find the characters in the string and print the count
    public static void main(String[] args) {
        String str = "Vikrama";
        List<char[]> characterList = Arrays.asList(str.toCharArray());
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);




    }
}
