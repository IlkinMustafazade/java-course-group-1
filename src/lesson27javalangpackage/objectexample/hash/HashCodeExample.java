package lesson27javalangpackage.objectexample.hash;

import java.util.ArrayList;
import java.util.List;

public class HashCodeExample {
    public static void main(String[] args) {
        Integer iObj = new Integer(2008);
        System.out.println(iObj.hashCode());
        String str = new String("Java");
        System.out.println("Hash code for str: " +str.hashCode());
        System.out.println("Hash code for str: " +str.hashCode());
    }
}
