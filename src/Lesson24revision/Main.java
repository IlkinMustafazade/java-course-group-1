package Lesson24revision;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 10};
        printArr(arr);
        addElementsOfArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " | ");
        }
        System.out.println();

    }

    static void addElementsOfArr(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of the elements an Array is: " + sum);
    }
}