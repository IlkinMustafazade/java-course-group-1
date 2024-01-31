package lesson19.az.orientacademy.oop.packaging;

import lesson18oop2.factory.Employee;

public class HR extends Employee {



    public HR(int no, String name, int year, String department) {
        super(no, name, year, department);
    }
    public void show(){
        System.out.println(no);
        System.out.println(name);
        System.out.println(no);
    }
}
