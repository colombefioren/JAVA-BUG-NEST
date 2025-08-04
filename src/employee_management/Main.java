package employee_management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Department myDepartment = new Department("IT", new ArrayList<>());
        myDepartment.addEmployee(TestCases.fullTimeEmployeeKoto());
        myDepartment.addEmployee(TestCases.partTimeEmployeeLita());
        System.out.println(myDepartment.showDetails());
    }
}
