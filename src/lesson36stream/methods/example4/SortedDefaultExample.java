package lesson36stream.methods.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDefaultExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(0);
        numbers.add(2);
        numbers.add(23);
        numbers.add(45);
        numbers.add(-10);
        System.out.println(numbers);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}
