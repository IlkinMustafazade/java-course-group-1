package lesson18oop2.encapsulation;

public class Car {
    private String marka;
    private String model;
    private String year;
    private int speed;
    private int distance;

    public String getBrand() {
        return marka;
    }

    public void setBrand(String brand) {
        this.marka = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
