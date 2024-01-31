package lesson34collections1.arraylist.methods.example20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod20 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        arrayList.add("Mahir");
        arrayList.add("Vuqar");
        arrayList.add("Samir");
        arrayList.add("Gunay");
        System.out.println(arrayList);

        List<String> myList = arrayList.subList(2, 5);
        System.out.println(myList);

        myList.add("Elcin");
        System.out.println(myList);
        System.out.println(arrayList);

        arrayList.add("Turkan");
        System.out.println(arrayList);

        System.out.println(myList);

    }
}
