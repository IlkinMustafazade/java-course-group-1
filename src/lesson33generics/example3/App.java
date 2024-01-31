package lesson33generics.example3;

public class App {
    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.showElements(new String[]{"Hi", "Hello", "Bye", "Good bye"});
        method.showElements(new Integer[]{1, 3, 5, 7, 9});
        method.showElements(new Double[]{2.2, 4.4, 6.6, 8.8, 10.10});

    }
}

