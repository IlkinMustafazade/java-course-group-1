package lesson15methods;

import java.util.Scanner;

public class MethodDemo {

    public static void main(String[] args) {
        int inputUser;
        for (; ; ) {
            inputUser = showMenu();
            if (inputUser == 0) {
                break;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("ilk ededi daxil edin");
            int firstNum = scanner.nextInt();
            System.out.println("ikinci ededi daxil edin");
            int secondNum = scanner.nextInt();
            switch (inputUser) {
                case 1:
                    addNumbers(firstNum, secondNum);
                    break;
                case 2:
                    int result = subTwoNumbers(firstNum, secondNum);
                    System.out.println("Daxil olunan ededlerin ferqi:  " + result);
                    break;
                case 3:
                    multiplyNumbers(firstNum,secondNum);
                    break;
                case 4:
                    divideNumbers(firstNum,secondNum);
                    break;
                default:
                    System.err.println("Invalid Method Number, please try again....");
            }
        }


    }

    private static void divideNumbers(int firstNum, int secondNum) {
        if (secondNum==0){
            System.out.println("Mexrec 0 ola bilmez");
        }
       else System.out.println("Daxil olunan ededlerin qismeti: " + (firstNum/secondNum));
    }

    private static void multiplyNumbers(int firstNum, int secondNum) {
        System.out.println("Daxil olunan ededlerin hasili: " + (firstNum * secondNum));
    }


    private static int showMenu() {
        System.out.println("*********** Calculation Menu ***********");
        System.out.println("1. - iki ededin Cemi");
        System.out.println("2. - iki ededin Ferqi");
        System.out.println("3. - iki ededin Hasili");
        System.out.println("4. - iki ededin Qismeti");
        System.out.println("Programdan cixmaq ucun 0 dumesini secin");
        System.out.println("****************************************");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addNumbers(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Daxil olunan ededlerin cemi:" + sum);
    }

    private static int subTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}