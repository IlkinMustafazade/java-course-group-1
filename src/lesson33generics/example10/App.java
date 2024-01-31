package lesson33generics.example10;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void showAll(List<? super Number> list) {
//        for (Number number : list){//Compile Error
//            System.out.println(number);
    }

    public static void main(String[] args) {
        List<? super Integer> numbers1 = new ArrayList<>();
        List<? super Integer> numbers2 = new ArrayList<Number>();
        List<? super Integer> numbers3 = new ArrayList<Object>();
//        List<? super Integer > numbers4 = new ArrayList<String>(); ?//Compile Error

        List<? super Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(3.3);
        numbers.add(3.33f);
    }
}
