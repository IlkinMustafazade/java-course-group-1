package lesson36stream.methods.example6;

import java.util.ArrayList;
import java.util.List;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(3);
        numbers.add(43);
        numbers.add(-5);
        numbers.add(23);
        numbers.forEach(System.out::println);
        System.out.println();
        numbers.forEach(Calculate::add);

    }
}

class Calculate {
    public static void add(int i) {
        i += 5;
        System.out.println(i);
    }
}
