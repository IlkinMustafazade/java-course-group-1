package lesson29javainputoutput.task;

import java.util.Random;

public class UtilArray {

    public static int[] arrayList(int size, int num) {
        int[] newArrayList = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int ranNum = random.nextInt(num) + 1;
            newArrayList[i] = ranNum;
        }
        return newArrayList;

    }

    public static int[] oddNumbers(int[] arr) {
        int[] oddNumbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0 && arr[i] != 1) {
                oddNumbers[i] = arr[i];
            }
        }
        return oddNumbers;
    }

    public static int[] evenNumbers(int[] array) {
        int[] evenNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0 && array[i] != 1) {
                evenNumbers[i] = array[i];
            }
        }
        return evenNumbers;
    }
}
