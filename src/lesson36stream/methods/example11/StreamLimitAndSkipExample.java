package lesson36stream.methods.example11;

import java.util.ArrayList;
import java.util.List;

public class StreamLimitAndSkipExample {
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
        studentList
                .stream()
                .filter(e->e.age>21)
                .limit(1)
                .forEach(System.out::println);
        studentList.stream().filter(e->e.age>21).skip(1).forEach(System.out::println);
    }
}

class Student {
    String name;
    String gender;
    int age;
    double avrGrade;

    public Student(String name, String gender, int age, double avrGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.avrGrade = avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", avrGrade=" + avrGrade +
                '}';
    }
}
