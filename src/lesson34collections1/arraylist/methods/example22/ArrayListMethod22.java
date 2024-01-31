package lesson34collections1.arraylist.methods.example22;

import java.util.List;

public class ArrayListMethod22 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 7);
        System.out.println(list);

//        list.add(9);
//        System.out.println(list);

        List<Integer> list1 = List.copyOf(list);
        System.out.println(list1);

//        list1.add(9);
//        System.out.println(list1);

    }
}
