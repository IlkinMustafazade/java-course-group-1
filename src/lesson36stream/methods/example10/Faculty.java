package lesson36stream.methods.example10;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFaculty(Student student) {
        studentList.add(student);
    }
}
