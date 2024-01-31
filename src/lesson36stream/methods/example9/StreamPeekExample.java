package lesson36stream.methods.example9;

import java.util.stream.Stream;

public class StreamPeekExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        long result = stream.distinct().peek(System.out::println).count();
        System.out.println("Count = " + result);
    }
}
