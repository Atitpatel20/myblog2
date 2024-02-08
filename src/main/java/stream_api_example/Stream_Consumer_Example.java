package stream_api_example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream_Consumer_Example {
    public static void main(String[] args) {
       Consumer<Integer>val= number -> System.out.println(number);
        val.accept(25);

        List<String> names = Arrays.asList("mike", "adam", "stallin");
        Consumer<String>data= name-> System.out.println(name);
        names.forEach(data);
    }
}
