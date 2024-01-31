package lesson27javalangpackage.objectexample.objexmample;

public class Manager extends Employee{
    protected String name;
    protected String surname;

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
