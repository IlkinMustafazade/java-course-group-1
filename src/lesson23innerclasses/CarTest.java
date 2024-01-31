package lesson23innerclasses;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        Car.Make make = car.new Make("Porsche", "Macan", "2022");
        car.setSpeed(220);
        car.setDistance(1500);
        car.setMake(make);

        System.out.println(car);
    }
}
