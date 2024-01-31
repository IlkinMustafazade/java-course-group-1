package lesson36stream.methods.example10;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        Student student1 = new Student("Ilkin", "male", 23, 5.2);
        Student student2 = new Student("Gunay", "female", 18, 9.2);
        Student student3 = new Student("Ikram", "male", 22, 6.7);
        Student student4 = new Student("Aygun", "female", 25, 8.2);
        Student student5 = new Student("Tahir", "male", 21, 9.5);
        Student student6 = new Student("Zahra", "female", 19, 6.5);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied Mathematics");

        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);

        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);
        faculty2.addStudentToFaculty(student6);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        facultyList
                .stream()
                .flatMap(faculty -> faculty.getStudentList().stream())
                .forEach(element -> System.out.println(element.getName()));





    }
}

