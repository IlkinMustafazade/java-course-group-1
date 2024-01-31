package lesson34collections1.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ilkin");
        vector.add("Ikram");
        vector.add("Tahir");
        vector.add("Tural");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(0);
        System.out.println(vector);

    }
}
