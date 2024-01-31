package lesson36stream.methods.example8;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(9, 99, 999, 9999, 99999, 999999);
        stream.forEach(System.out::println);
        System.out.println();
        Double[] doubles = {9.9, 9.99, 9.999, 9.9999, 9.99999};
        Stream<Double> doubleStream = Stream.of(doubles);
        doubleStream.forEach(System.out::println);
    }
}
