package com.myblog2.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPredicate_fiter_Example {
    public static void main(String[] args) {
// Q-1Given a list of strings, filter out strings with a length less than 5.
        List<String> data1 = Arrays.asList("kamal", "nayan", "jenish", "avinash", "miral");
        List<String> result1 = data1.stream().filter(str -> str.length() >5).collect(Collectors.toList());
        System.out.println(result1);

        // Q-2 Given a list of integers, filter out the even numbers.
        List<Integer> data2 = Arrays.asList(10, 15, 20, 25, 30, 45, 50, 55, 65, 70);
        List<Integer> evenNumbers = data2.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Q-3 Given a list of Person objects, filter out persons older than 30.
        List<Person> data3 = Arrays.asList(
                new Person("Atit", 27, "Male"),
                new Person("Priyanshi", 29, "Female"),
                new Person("Champaben", 47, "Female"),
                new Person("Ashwinbhai", 57, "male")
        );
        List<Person> result3 = data3.stream().filter(str -> str.getAge() <= 30).collect(Collectors.toList());
        System.out.println(result3);

        // Q-4 Given a list of strings, filter out strings starting with the letter 'a'.
        List<String> list = Arrays.asList("mike", "jenish", "nikunj", "ayush", "jenish");
        List<String> names1 = list.stream().filter(str -> str.startsWith("n")).collect(Collectors.toList());
        List<String> names2 = list.stream().filter(str -> str.equals("jenish")).collect(Collectors.toList());
        List<String> names3 = list.stream().filter(str -> str.endsWith("e")).collect(Collectors.toList());
        System.out.println(names1);
        System.out.println(names2);
        System.out.println(names3);

        //Q-4  Given a list of Person objects, filter out females.
        List<Person>data5=Arrays.asList(
                new Person("Atit", 27, "Male"),
                new Person("Priyanshi", 29, "Female"),
                new Person("Champaben", 47, "Female"),
                new Person("Ashwinbhai", 57, "Male")
        );
        List<Person> result5 = data5.stream().filter(str -> str.getGender().equals("Male")).collect(Collectors.toList());
        System.out.println(result5);

        // Q-5 Scenario: Filter a list of integers to include only those between 20 and 50.
        List<Integer> integers = Arrays.asList(10, 20, 25, 30, 35, 45, 50, 60, 80, 90);
        List<Integer> result6 = integers.stream().filter(i -> i > 20 && i < 50).collect(Collectors.toList());
        System.out.println(result6);

        // Q-6 Combine two conditions to filter out strings starting with "A" and having a length greater than 3.
        List<String> data7 = Arrays.asList("mike", "jenish", "nikunj", "ayush", "jay");
        List<String> result7 = data7.stream().filter(str -> str.startsWith("a") && str.length() > 3).collect(Collectors.toList());
        System.out.println(result7);
    }
}
