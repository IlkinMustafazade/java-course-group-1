package lesson27javalangpackage.objectexample.equals;

import lesson27javalangpackage.objectexample.equals.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ilkin", "Mustafazade");
        Student student2 = new Student(1, "Ilkin", "Mustafayev");

//        student1 = student2;

        System.out.print("Is student1 = student2: ");
        boolean b = student1 == student2;
        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");


        System.out.print("\nIs student1 equals student2: ");
        b = student1.equals(student2);
        if (b)
            System.out.println("The same");
        else
            System.out.println("Different");

        System.out.println("\n" + student1);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
