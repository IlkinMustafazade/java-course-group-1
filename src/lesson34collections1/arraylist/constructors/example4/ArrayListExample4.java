package lesson34collections1.arraylist.constructors.example4;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ilkin");
        arrayList1.add("Tural");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);

        //they are different objects
        System.out.println(arrayList1 == arrayList2);
    }
}
