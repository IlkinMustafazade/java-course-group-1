package lesson32lambda.task;

import java.util.Scanner;
import java.util.function.Function;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input = scanner.nextLine();

        Function<String, String> function = s -> s.replaceAll(" ", "");

        System.out.println(function.apply(input));
    }
}
