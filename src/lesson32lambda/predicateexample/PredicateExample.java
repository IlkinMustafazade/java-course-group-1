package lesson32lambda.predicateexample;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = s -> s > 10;

        System.out.println(predicate.test(500));
        System.out.println(predicate.test(5));


    }
}
