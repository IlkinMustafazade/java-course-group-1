package lesson17oop1;

public class Car {
    static String brand;
    String model;
    String year;
    int speed;
    int distance;
    public Car(){
        System.out.println("constructor");
    }

   static  {
       System.out.println("Static Block");
    }

    {
        System.out.println("non-static Block");
    }

}
