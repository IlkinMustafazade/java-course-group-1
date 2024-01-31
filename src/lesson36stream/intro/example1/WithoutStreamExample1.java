package lesson36stream.intro.example1;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(22);
        list.add(53);
        list.add(199);
        list.add(24);
        System.out.println(list);

        List<Integer> evenlist = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                evenlist.add(number);
            }
        }
        System.out.println("Even Numbers List: " + evenlist);
    }
}
