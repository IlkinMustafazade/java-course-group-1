package lesson39dependency;

public class Student {
    private String name;
    private String surname;
    private University university;

    public Student(String name, String surname, University university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }
}
