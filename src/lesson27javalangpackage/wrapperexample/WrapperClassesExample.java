package lesson27javalangpackage.wrapperexample;

public class WrapperClassesExample {
    public static void main(String[] args) {
        Boolean obj = new Boolean(true); // deprecated
        Boolean obj1 = true;

        Integer integer = new Integer(12);
        Integer integer1 = 12;

        double d = 12.5;
        Double obj3 = d;

        Byte obj4 = new Byte("23");
        byte b = Byte.parseByte("23");
        Byte obj5 = b;


        Integer integer2 = Integer.valueOf("23.5");
        int i = Integer.parseInt("23.5");

//        Integer integer3 = Integer.valueOf('a');
//        int i = Integer.parseInt('a');

        int ii = 10;
        Integer iObject = i; //auto-boxing
        int iii = iObject; //auto-unboxing

    }
}
