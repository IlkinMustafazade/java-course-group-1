package Lesson20oop3.factory;

public class Director extends Manager{
    protected int bonus;

    public Director(){

    }

    public Director(int id, String name, int year, String department,
                    String managerDepartment,int bonus) {
        super(id, name, year, department, managerDepartment);
        this.bonus = bonus;
    }

//    public void work() {
//        System.out.println("Director is working");
//    }

    public void makesStrategicPlan(){
        System.out.println("Director makes a Strategic plan for company");
    }

    public double calculateSalary() {
        return year * BASE_SALARY + MANAGER_SALARY + bonus;
    }
}
