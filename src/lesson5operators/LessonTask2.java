package lesson5operators;

import java.util.Scanner;

public class LessonTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yer deyisme ucun a deyisenine qiymet verin a = ");
        double a = sc.nextDouble();
        System.out.print("Yer deyisme ucun b deyisenine qiymet verin b = ");
        double b = sc.nextDouble();
        b = b - a;
        a = a + b;
        System.out.println("a = " + a);
        b = a - b;
        System.out.println("b = " + b);
    }
}
