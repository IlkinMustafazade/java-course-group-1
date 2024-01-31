package lesson18oop2.encapsulation;

public class Test {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setModel("X5");
        bmw.setYear("2022");
        bmw.setDistance(2000);
        bmw.setSpeed(10);

        Car porsche = new Car();
        porsche.setBrand("Porsche");


        System.out.println("Car info: " + " Brand name: " + bmw.getBrand() + " Model: " + bmw.getModel());
    }
}
