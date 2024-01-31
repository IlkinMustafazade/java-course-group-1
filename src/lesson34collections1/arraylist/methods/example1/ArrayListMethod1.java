package lesson34collections1.arraylist.methods.example1;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ilkin");
        arrayList.add("Ikram");
        arrayList.add("Tahir");
        for (String name : arrayList){
            System.out.print(name + ", ");
        }
        System.out.println();
    }
}
