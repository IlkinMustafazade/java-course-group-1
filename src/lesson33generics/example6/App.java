package lesson33generics.example6;

public class App {
    public static void print(Object obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        Integer integer = 10;
        print(integer);
    }
}

