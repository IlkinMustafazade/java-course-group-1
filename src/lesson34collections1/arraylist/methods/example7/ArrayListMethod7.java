package lesson34collections1.arraylist.methods.example7;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod7 {
    public static void main(String[] args) {
        Student student1 = new Student("Ilkin", "male", 24, 3, 9.5);
        Student student2 = new Student("Aygun", "female", 18, 5, 8.7);
        Student student3 = new Student("Ikram", "male", 22, 1, 9.9);
        Student student4 = new Student("Tahir", "male", 18, 5, 7.7);
        Student student5 = new Student("Gunay", "female", 25, 2, 6.5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);
        Student student6 = new Student("Gunay", "female", 25, 2, 6.5);
        studentList.remove(student6);
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0
                && Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

}
