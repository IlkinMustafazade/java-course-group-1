package lesson33generics.example1;

public class App {
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }
    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        add(5,7);
        add(5.5,7);

    }
}
