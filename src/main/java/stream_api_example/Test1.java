package stream_api_example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//        // 1- java program to count the occurance off each charector in string
//        String str = "banana";
//        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        collect.forEach((character, count) -> System.out.println("character '" + character + "'occures'" + count + "'times."));
//
//        //2- java program to find all duplicate eliment from string4
//        Map<Character, Long> collect1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        collect1.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .forEach(entry ->
//                        System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times."));
//
//        //java program to find all unique eliment from string
//        Map<Character, Long> collect2 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        collect2.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry -> System.out.println(entry.getKey()));
//
//        //java program to find first non repeateav  eliment from string
//        Map<Character, Long> collect3 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        Character c = collect3.entrySet().stream()
//                .filter(entry -> entry.getValue()==1)
//                .map(entry->entry.getKey())
//                .findFirst()
//                .orElse('\0');
//        System.out.println(c);
//
//        //java program to find first  repeateav  eliment from string
//        Map<Character, Long> collect4 = str.chars().mapToObj(c1 -> (char) c1).collect(Collectors.groupingBy(c1 -> c1, Collectors.counting()));
//
//        Character c1 = collect4.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(entry->entry.getKey())
//                .findFirst()
//                .orElse('\0');
//        System.out.println(c1);
//
//        // java program to find second highest value
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
//        int secondHighest = Arrays.stream(numbers)
//                .boxed()
//                .sorted((a, b) -> Integer.compare(b, a))
//                .distinct()
//                .skip(1)
//                .findFirst()
//                .orElse(Integer.MIN_VALUE);
//        System.out.println(secondHighest);
//
//        // java program second lowest value from array
//        Integer secondLowest = Arrays.stream(numbers).boxed().sorted((a, b) -> Integer.compare(a, b)).distinct().skip(1).findFirst().orElse(Integer.MIN_VALUE);
//        System.out.println(secondLowest);
//
//        // java program to find longest name from string
//
//        String[] names={"mike","adam","stallin","jay"};
//        String s = Arrays.stream(names).collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
//        System.out.println(s);

        // java program to find number strart with 1 from string
        Arrays.stream(numbers)
                .filter(num -> String.valueOf(num).startsWith("1"))
                .forEach(System.out::println);
//        Arrays.stream(numbers).filter(num->String.valueOf(num).startsWith("1")).forEach(System.out::println);
//        Arrays.stream(numbers)
//                .filter(num -> Integer.toString(num).equals("1")).forEach(System.out::println);

        List<String> names = Arrays.asList("1","2","3","4");
        String join = String.join("-", names);
        System.out.println(join);
    }
}



