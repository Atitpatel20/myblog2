package stream_api_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorting_Example {
    public static void main(String[] args) {
//Q-1 sort the elements numbers of a stream in ascending order first & then descending order

        List<Integer> data = Arrays.asList(5, 9, 2, 4, 7, 1, 3, 6, 8);
        List<Integer> sortedNumber = data.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedNumber:"+sortedNumber);

        List<Integer> reverseNumber = data.stream().sorted((s1, s2) -> Integer.compare(s2, s1)).collect(Collectors.toList());
        System.out.println(reverseNumber);

        // Q-2 sort the elements numbers of a stream in ascending order first & then descending order
        List<String> fruits = Arrays.asList("Banana", "Apple", "Chiku", "Mango", "Orange");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedFruits:"+sortedFruits);

        List<String> reverseFruits = fruits.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("reverseFruits:"+reverseFruits);

        // Q-3 sort by first age ascending order
        // sort by second age descending order
        // sort by third name ascending order

        List<Person> data3 = Arrays.asList(
                new Person("Atit", 27, "Male"),
                new Person("Priyanshi", 29, "Female"),
                new Person("Champaben", 47, "Female"),
                new Person("Ashwinbhai", 57, "Male")
        );
        List<Person> sortedAge = data3.stream().sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())).collect(Collectors.toList());
        System.out.println(sortedAge);

        List<Person> descAge = data3.stream().sorted((s1, s2) -> Integer.compare(s2.getAge(),s1.getAge())).collect(Collectors.toList());
        System.out.println(descAge);

        List<Person> sortByName = data3.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
        System.out.println(sortByName);


    }
}
