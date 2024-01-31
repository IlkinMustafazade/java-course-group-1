package lesson5operators;

import java.util.Scanner;

public class LessonTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki ededi muqayise etmek ucun ededleri daxil edin");
        System.out.print("a = ");
        int firstNum = scanner.nextInt();
        System.out.print("b = ");
        int secondNum = scanner.nextInt();

        int max = (firstNum > secondNum) ? firstNum : secondNum;
        int min = (firstNum > secondNum) ? secondNum : firstNum;
        System.out.println("Daxil edilmis max eded: " + max);
        System.out.println("Daxil edilmis min eded: " + min);
    }
}
