package Lesson20oop3.factory;

public class HR {

    public Employee getAnEmployee() {
        Employee employee = null;
        int random = (int) (3 * Math.random());
        switch (random) {
            case 0:
                employee = new Employee();
                break;
            case 1:
                employee = new Manager();
                break;
            case 2:
                employee = new Director();
                break;
        }
        return employee;
    }

}
