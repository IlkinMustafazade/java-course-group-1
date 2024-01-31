package lesson34collections1.arraylist.constructors.example3;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>(100);
        arrayList1.add("Ilkin");
        arrayList1.add("Tural");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
        System.out.println(arrayList1);
    }
}
