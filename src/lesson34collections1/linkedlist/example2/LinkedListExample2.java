package lesson34collections1.linkedlist.example2;

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        Student student1 = new Student("Ilkin", 4);
        Student student2 = new Student("Ikram", 2);
        Student student3 = new Student("Tahir", 1);
        Student student4 = new Student("Vuqar", 4);
        Student student5 = new Student("Mahir", 3);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);
        System.out.println(studentLinkedList);
        System.out.println(studentLinkedList.get(2));

        Student student6 = new Student("Samir", 3);
        studentLinkedList.add(student6);
        System.out.println(studentLinkedList);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
