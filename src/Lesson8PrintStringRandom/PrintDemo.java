package Lesson8PrintStringRandom;

import java.util.Random;

public class PrintDemo {
    public static void main(String[] args) {
        //initialize random number generator
        Random random = new Random();
        int a = 50;
        int b = 60;

        for (int i = 1; i <= 10; i++) {
            int secretNumber = random.nextInt(b - a) + a;
            System.out.println(secretNumber);
        }
    }
}
