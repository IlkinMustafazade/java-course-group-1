package lesson36stream.methods.example5;

import java.util.ArrayList;
import java.util.List;

public class MaxExample {
    public static void main(String[] args) {
        Student student1 = new Student("Ilkin", "male", 23, 5.2);
        Student student2 = new Student("Gunay", "female", 18, 9.2);
        Student student3 = new Student("Ikram", "male", 22, 6.7);
        Student student4 = new Student("Aygun", "female", 25, 8.2);
        Student student5 = new Student("Tahir", "male", 21, 9.5);
        Student student6 = new Student("Zahra", "female", 19, 6.5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        System.out.println(studentList);
        Student maxAge = studentList.stream()
                .max((s1, s2) -> s1.age - s2.age).get();
        System.out.println(maxAge);

    }
}