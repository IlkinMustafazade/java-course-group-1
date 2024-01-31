package Lesson12Arrays;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
//        Random random = new Random();
        int[] numbers = new int[10];
        int max = numbers[0];


        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = (int) (Math.random() + 100);
        }

        int min = numbers[0];

        for (int number : numbers) {
            System.out.print(number + " | ");
        }

        System.out.println();

        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Massivin en Boyuk elementi: " + max);

        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Massivin en Kicik elementi: " + min);
    }
}
