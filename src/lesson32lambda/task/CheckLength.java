package lesson32lambda.task;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = scanner.next();

        Predicate<String> predicate = str -> str.length() > 3;

        if (predicate.test(input)) System.out.println("Length of the word is greater than 3");
        else System.out.println("Length of the word is smaller than 3");
    }
}
