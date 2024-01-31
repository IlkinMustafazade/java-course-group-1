package lesson32lambda.consumerexample;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::print;

        consumer.accept("Senan");
        consumer.accept(" Suleymanov");
    }
}
