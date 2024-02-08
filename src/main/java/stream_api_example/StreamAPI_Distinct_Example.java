package stream_api_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Distinct_Example {
    public static void main(String[] args) {
       // Q-1 give only distinct record from this list
        // give distinct & sort the record by ascending order

        List<Integer> data1 = Arrays.asList(45, 85, 35, 15,45,55,25,45, 95, 65, 55, 25, 75);
        List<Integer> result = data1.stream().distinct().collect(Collectors.toList());
        List<Integer> result1 = data1.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(result);
        System.out.println(result1);

        // Q-2   remove duplicate people & print also duplicate people
        List<Person> data2 = Arrays.asList(
                new Person("Atit", 27, "Male"),
                new Person("Champaben", 47, "Female"),
                new Person("Priyanshi", 29, "Female"),
                new Person("Atit", 27, "Male"),
                new Person("Champaben", 47, "Female"),
                new Person("Ashwinbhai", 57, "male")
        );
        List<Person> result2 = data2.stream().distinct().collect(Collectors.toList());
        System.out.println(result2);
        System.out.println(data2);
    }
}
