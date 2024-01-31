package lesson3scannerandcomments;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum, result;
        System.out.println("Ilk ededi daxil edin");
        firstNum = sc.nextInt();
        System.out.println("Ikinci ededi daxil edin");
        secondNum = sc.nextInt();
        result = firstNum + secondNum;
        System.out.println("Daxil edilmis iki ededin cemi " + result);
    }
}
