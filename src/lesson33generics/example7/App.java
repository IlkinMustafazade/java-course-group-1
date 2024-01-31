package lesson33generics.example7;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5);
        print(numbers);
    }
}

//public class App {
//    public static void print(List<Object> list) {
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 3, 5);
//        print(numbers); //Compile Error
//    }
//}