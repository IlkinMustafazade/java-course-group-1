package lesson34collections1.arraylist.methods.example17;

import java.util.ArrayList;

public class ArrayListMethod17 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ilkin");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
        arrayList1.add("Mahir");
        arrayList1.add("Vuqar");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ikram");
        arrayList2.add("Samir");
        arrayList2.add("Mahir");
        arrayList2.add("Gunay");
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);


    }
}
