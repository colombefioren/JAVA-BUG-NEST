package employee_management;

public abstract class Employee {
    private final int employeeId;
    private final String name;
    private static int employeeIdCounter = 1;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(String name){
        this.employeeId = employeeIdCounter++;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

    public abstract double calculateTax();

}
