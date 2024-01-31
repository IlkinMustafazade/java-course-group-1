package lesson34collections1.arraylist.methods.example8;

import java.util.ArrayList;

public class ArrayListMethod8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ilkin");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }
}
