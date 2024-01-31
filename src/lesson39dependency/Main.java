package lesson39dependency;

public class Main {
    public static void main(String[] args) {
        Location location = new Location("Baku","Zahid X.","11B");
        University university = new University("BDU",location);
        Student student = new Student("Ilkin","Mustafazaada", university );
    }
}
