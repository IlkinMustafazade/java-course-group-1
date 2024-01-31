package lesson35collections2.map.hashmap.example9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample9 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Ilkin", "Mustafazada", 3);
        Student student2 = new Student("Ikram", "Isgandarov", 4);
        Student student3 = new Student("Tahir", "Asgerov", 1);
        Student student4 = new Student("Vuqar", "Mammadov", 2);
        map.put(student1, 6.5);
        map.put(student2, 9.8);
        map.put(student3, 7.2);
        map.put(student4, 5.5);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

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
