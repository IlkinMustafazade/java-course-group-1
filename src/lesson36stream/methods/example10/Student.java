package lesson36stream.methods.example10;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double avrGrade;

    public Student(String name, String gender, int age, double avrGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.avrGrade = avrGrade;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getAvrGrade() {
        return avrGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", avrGrade=" + avrGrade +
                '}';
    }
}