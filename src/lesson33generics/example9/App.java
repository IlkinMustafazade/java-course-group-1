package lesson33generics.example9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void showAll(List<? extends Number> list){
        for (Number number : list){
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        List<? extends Number> numbers1 = new ArrayList<Integer>();
        List<? extends Number> numbers2 = new ArrayList<Double>();
        List<? extends Number> numbers3 = new ArrayList<Float>();

        showAll(numbers1);
    }
}

