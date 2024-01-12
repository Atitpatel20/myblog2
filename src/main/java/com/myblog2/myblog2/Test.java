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

        // find the length of given name
//        Function<String,Integer>data=str->str.length();
//        Integer result = data.apply("madhav");
//        System.out.println(result);

//        Function<Integer,Integer>val=i->i+10;
//        Integer result = val.apply(15);
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(10, 15, 20, 36, 24, 60);
//        List<Integer> result = numbers.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(result);

        // all the names in upper case and lower case
//        List<String> names = Arrays.asList("mike", "jenish", "nikunj", "ayush");
//        List<String> result1 = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
//        List<String> result2 = names.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
//        System.out.println(result1);
//        System.out.println(result2);

//        List<String> names = Arrays.asList("kamal", "nayan", "jenish", "avinash", "miral");
//        List<String> res = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(res);

//        List<Integer> numbers = Arrays.asList(15, 5, 20, 17, 26, 34, 14);
//        List<Integer> result = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(result);

        List<Integer> numbers = Arrays.asList(10, 15, 36, 20, 15, 27, 36, 69, 47, 27);
        List<Integer> result1 = numbers.stream().distinct().collect(Collectors.toList());
        List<Integer> result2 = numbers.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(result1);
        System.out.println(result2);


        List<Person> names = Arrays.asList(
                new Person("mike", 48, "Male"),
                new Person("stallin", 27, "Male"),
                new Person("hiya", 42, "Female"),
                new Person("nisha", 15, "Female")

        );
        List<Person> nams = names.stream().filter(str -> str.getAge() > 30).collect(Collectors.toList());
        for(Person n:nams){
            System.out.println(n.getName());
            System.out.println(n.getGender());
            System.out.println(n.getAge());
        }
    }

}
