package lesson33generics.example5;

public class App {
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0)
            return num1;
        return num2;
    }

    public static void main(String[] args) {
        System.out.println(calculateMin(230, 54));
        System.out.println(calculateMin('f', 'a'));
        System.out.println(calculateMin("Hello", "Bye"));

    }
}

