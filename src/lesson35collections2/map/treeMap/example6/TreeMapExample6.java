package lesson35collections2.map.treeMap.example6;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample6 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
       Student student1 = new Student("Ilkin", "Mustafazada", 3);
       Student student2 = new Student("Ikram", "Isgandarov", 4);
       Student student3 = new Student("Tahir", "Asgerov", 1);
       Student student4 = new Student("Vuqar", "Mammadov", 2);
       Student student5 = new Student("Rasul", "Ahmadov", 3);
       Student student6 = new Student("Mahir", "Musayev", 4);
       Student student7 = new Student("Gunay", "Memmedova", 1);
        treeMap.put(9.1, student1);
        treeMap.put(5.5, student2);
        treeMap.put(8.2, student3);
        treeMap.put(7.9, student4);
        treeMap.put(3.2, student5);
        treeMap.put(9.6, student6);
        treeMap.put(6.4, student7);
        System.out.println(treeMap);
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}

