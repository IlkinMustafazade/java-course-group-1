package lesson23innerclasses;

public class Car {
    private int speed;
    private int distance;
    private Make make;

    protected class Make{
        private String brand;
        private String model;
        private String year;

        public Make(String brand, String model, String year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() {
            System.out.println();
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Make{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", year='" + year + '\'' +
                    '}';
        }
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

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", distance=" + distance +
                ", make=" + make +
                '}';
    }
}
