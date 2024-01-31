package Lesson6IfDemo;

import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemler massivine tam ededleri daxil edin:");
        String numbers = scanner.nextLine();
        String[] numArray = numbers.split(" ");
        System.out.println("Daxil edilmis ededler massivi:");
        int[] newNumbers = convertStringToIntArr(numArray);
        printArr(newNumbers);
        int[] complexNumbers = checkComplexNum(newNumbers);
        System.out.println("Daxil edilmis Massivdeki Murekkeb ededler:");
        printComplexNum(complexNumbers);
    }

    // Massivdeki Murekkeb ededleri cap etmek
    private static void printComplexNum(int[] complexNumbers) {
        for (int num : complexNumbers) {
            if (num == 0)
                continue;
            System.out.print(num + ", ");
        }
    }

    private static void printArr(int[] numArray) {
        for (int num : numArray) {
            System.out.print(num + " | ");
        }
        System.out.println("\n******************");
    }

    //String massivini int massivine cevrilmesi
    private static int[] convertStringToIntArr(String[] array) {
        int[] intArr = new int[array.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(array[i]);
        }
        return intArr;
    }

    // Murekkeb ededlerin yoxlanmasi
    private static int[] checkComplexNum(int[] numbers) {
        int[] newComplexArr = new int[numbers.length];
        int index = 0;
        for (int num : numbers) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    newComplexArr[index] = num;
                    index++;
                    break;
                }
            }

        }
        return newComplexArr;
    }
}
