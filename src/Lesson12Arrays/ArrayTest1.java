package Lesson12Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
            System.out.print(numbers[i] + " | ");
        }
    }
}
