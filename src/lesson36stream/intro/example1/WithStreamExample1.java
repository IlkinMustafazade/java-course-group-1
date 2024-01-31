package lesson36stream.intro.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(22);
        list.add(53);
        list.add(199);
        list.add(24);
        System.out.println(list);
        List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
