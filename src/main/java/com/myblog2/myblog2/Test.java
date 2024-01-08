package com.myblog2.myblog2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Predicate<Integer> val=x->x%2==0;
//        boolean test = val.test(10);
//        System.out.println(test);

//       Predicate<String> name=str ->str.equals("mike");
//        boolean result = name.test("stallin");
//        System.out.println(result);

        // give the only odd numbers form list
//        List<Integer> numbers = Arrays.asList(10, 15, 20, 37, 69, 42);
//        List<Integer> result = numbers.stream().filter(y -> y % 2 == 0).collect(Collectors.toList());
//        System.out.println(result);

        // give the only odd numbers
//        List<Integer> numbers = Arrays.asList(10, 25, 34, 13, 67, 21, 20);
//        List<Integer> result = numbers.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
//
        //filter the record whos name start with "J", whose name is twice & who's name end's with e
//        List<String> names = Arrays.asList("mike", "jay", "nilay", "ajay", "nilay");
//        List<String> data1 = names.stream().filter(str -> str.startsWith("j")).collect(Collectors.toList());
//        List<String> data2 = names.stream().filter(str -> str.equals("nilay")).collect(Collectors.toList());
//        List<String> data3 = names.stream().filter(str -> str.endsWith("e")).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);

        Function<String,Integer>data=str->str.length();
        Integer result = data.apply("madhav");
        System.out.println(result);

    }

}
