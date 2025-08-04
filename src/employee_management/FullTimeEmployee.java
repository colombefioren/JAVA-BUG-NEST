package employee_management;

public class FullTimeEmployee extends Employee{

    public double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId,name);
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }

    public double calculateTax(){
        return 0.2 * calculatePay();
    }
}

