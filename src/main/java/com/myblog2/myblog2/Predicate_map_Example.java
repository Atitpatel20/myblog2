package com.myblog2.myblog2;

import org.antlr.v4.runtime.misc.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Predicate_map_Example {
    public static void main(String[] args) {
//    Q-1    find the length of given string given me o/p true or false

       Predicate<String> val=str->str.length()>5;
        boolean result1 = val.test("Example");
        System.out.println(result1);

        // find the string has contain a of given string given me o/p true or false
       Predicate<String> data2=str->str.contains("a");
        boolean result2 = data2.test("banana");
        System.out.println(result2);

        // find the string is emplty or not  of given string given me o/p true or false
        Predicate<String>data3=str->str.isEmpty();
        boolean result3 = data3.test("testing");
        System.out.println(result3);

        // map example
       //Q-1 find the length of given string
        Function<String,Integer>data4=str->str.length();
        Integer result4 = data4.apply("pankaj sir acadamy");
        System.out.println(result4);

        // Q-2 add value in +10 to any value and give the output
       Function<Integer,Integer> data5=i->i+10;
        Integer result5 = data5.apply(25);
        System.out.println(result5);

        // Q-3 add 20 with all numbers in given list(10,25,39,14,25)
        List<Integer> data6 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result6 = data6.stream().map(i -> i + 20).collect(Collectors.toList());
        System.out.println(result6);
    }
}
