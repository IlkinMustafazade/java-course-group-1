package lesson34collections1.arraylist.methods.example19;

import java.util.ArrayList;

public class ArrayListMethod219 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ilkin");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
        arrayList1.add("Mahir");
        arrayList1.add("Vuqar");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ikram");
        arrayList2.add("Samir");
        arrayList2.add("Mahir");
        arrayList2.add("Gunay");

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);


    }
}
