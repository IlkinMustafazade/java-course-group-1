package lesson28javadocandannotations.example4;

public class SupperWarningsTest {
//    @SuppressWarnings("all")
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Monday");
//        list.add("Winter");
//        list.add("Evening");
//
//        for (Object obj : list)
//            System.out.println(obj);
//    }
        @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        SupperWarningsTest depObj = new SupperWarningsTest();
        depObj.deprecatedMethod();
    }
}

