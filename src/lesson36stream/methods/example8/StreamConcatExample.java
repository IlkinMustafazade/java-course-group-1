package lesson36stream.methods.example8;

import java.util.stream.Stream;

public class StreamConcatExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6, 8, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
    }
}
