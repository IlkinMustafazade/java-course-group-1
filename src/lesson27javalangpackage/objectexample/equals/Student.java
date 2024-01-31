package lesson27javalangpackage.objectexample.equals;

public class Student {
    private int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        boolean b = false;
        if (id == student.id)
//                && name.equals(student.name) && surname.equals(student.surname))
            b = true;
        return b;
    }

    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public String toString() {
        return "lesson27javalangpackage.ObjectExample.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
