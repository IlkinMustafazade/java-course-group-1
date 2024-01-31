package lesson35collections2.map.linkedhashmap.example2;


import java.util.LinkedHashMap;

public class LinkedHashMapExample2 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, false);
//        LinkedHashMap<Double, Student> linkedHashMap =
//                new LinkedHashMap<>(16, 0.75f, true);
        Student student1 = new Student("Ilkin", "Mustafazada", 3);
        Student student2 = new Student("Ikram", "Isgandarov", 4);
        Student student3 = new Student("Tahir", "Asgerov", 1);
        Student student4 = new Student("Vuqar", "Mammadov", 2);
        linkedHashMap.put(5.8, student1);
        linkedHashMap.put(9.9, student2);
        linkedHashMap.put(6.5, student3);
        linkedHashMap.put(8.5, student4);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(6.5));
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

