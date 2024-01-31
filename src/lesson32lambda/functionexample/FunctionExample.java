package lesson32lambda.functionexample;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Ayyub"));
        System.out.println(function.apply("Qasimov"));
    }
}
