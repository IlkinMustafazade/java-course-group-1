package lesson34collections1.arraylist.constructors.example2;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ilkin");
        arrayList1.add("Tural");
        arrayList1.add("Ikram");
        arrayList1.add("Tahir");
//        arrayList1.add(50); //Compile error
        System.out.println(arrayList1);
    }
}
