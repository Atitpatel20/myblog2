package com.myblog2.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction_map_Example {
    public static void main(String[] args) {


    // Q-1Scenario: Given a list of numbers, map each number to its square.
        List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = data1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(result1);

        // Q-2 Given a list of strings, map each string to its length.
        List<String> data2 = Arrays.asList("mike", "vinay", "keral", "priyank", "taral");
        List<Integer> result2 = data2.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(result2);

        // Q-3 Given a list of Person objects, map each person to their age.
        List<Person> data3 = Arrays.asList(
                new Person("Atit", 27, "Male"),
                new Person("Priyanshi", 29, "Female"),
                new Person("Champaben", 47, "Female"),
                new Person("Ashwinbhai", 57, "male")
        );
        List<Integer> result3 = data3.stream().map(str -> str.getAge()).collect(Collectors.toList());
        System.out.println(result3);

        //Q-4 Scenario: Given a list of strings, filter out strings that contain the letter 'a'
        // and map the remaining strings to uppercase.
        List<String> data4 = Arrays.asList("mike", "ayush", "priyank", "stallin");
        List<String> result4 = data4.stream().filter(str -> str.startsWith("a")).map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(result4);
        
    // Q-5 Given a list of numbers, map each number to a string by concatenating it with a prefix.
        List<Integer> data5 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> result5 = data5.stream().map(x -> "Number:" + x).collect(Collectors.toList());
        System.out.println(result5);
    }
}
