package lesson36stream.methods.example7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);

        Integer result = numbers
                .stream()
                .reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
        // 2, 4, 5, 10
        //accumulator = 2   8   40 400
        // element =    4   5   10


        List<Integer> list = new ArrayList<>();
//
//        int result1 = list.stream().reduce((accumulator, element) -> accumulator * element).get();
//        System.out.println(result1);

        Optional<Integer> result1 = list
                .stream()
                .reduce((accumulator, element) -> accumulator * element);
        if (result1.isPresent()) {
            System.out.println(result1);
        } else
            System.out.println("No present");
    }
}
