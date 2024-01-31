package lesson36stream.methods.example4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedComparatorExample {
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
//      studentList = studentList.stream().sorted().collect(Collectors.toList());
//      System.out.println(studentList); // ClassCastException
        studentList = studentList
                .stream()
                .sorted((x, y) -> x.name.compareTo(y.name))
                .collect(Collectors.toList());
        System.out.println(studentList);

    }
}

class Student  {
    String name;
    String sex;
    int age;
    double avrGrade;

    public Student(String name, String sex, int age, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", avrGrade=" + avrGrade +
                '}';
    }
}

