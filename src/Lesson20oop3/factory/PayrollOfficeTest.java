package Lesson20oop3.factory;

public class PayrollOfficeTest {
    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();
        Employee employee = new Employee(1, "Ilkin", 3, "Product");
        payrollOffice.paySalary(employee);

        Manager manager = new Manager(2, "Senan", 3, "Product", "Product");
        payrollOffice.paySalary(manager);

        Director director = new Director(3, "Eyyub", 3, "Product", "Manager", 3000);
        payrollOffice.paySalary(director);
    }
}
