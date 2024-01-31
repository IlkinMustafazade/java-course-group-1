package lesson35collections2.map.linkedhashmap.example1;


import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>();
        Student student1 = new Student("Ilkin", "Mustafazada", 3);
        Student student2 = new Student("Ikram", "Isgandarov", 4);
        Student student3 = new Student("Tahir", "Asgerov", 1);
        Student student4 = new Student("Vuqar", "Mammadov", 2);
        linkedHashMap.put(5.8,student1);
        linkedHashMap.put(9.9,student2);
        linkedHashMap.put(6.5,student3);
        linkedHashMap.put(8.5,student4);
        System.out.println(linkedHashMap);
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

}
