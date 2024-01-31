package lesson33generics.example8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<>();
//        numbers.add(20); //Compile Error
    }
}

//public class App {
//    public static void main(String[] args) {
//        List<? extends Number> numbers1 = new ArrayList<Integer>();
//        List<? extends Number> numbers2 = new ArrayList<Double>();
//        List<? extends Number> numbers3 = new ArrayList<Float>();
//        List<? extends Number> numbers4 = new ArrayList<String>(); //Compile Error
//    }
//}





