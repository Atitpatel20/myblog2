package stream_api_example;

import java.util.Random;
import java.util.function.Supplier;

public class StreamSupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> x = () -> new Random().nextInt(500);
        Integer y = x.get();
        System.out.println(y);
    }
}
