package employee_management;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */

    private final String name;
    private final List<Employee> employeeList;

    public Department(String name, List<Employee> employeeList) {
        this.name = name;
        this.employeeList = new ArrayList<>();

        Set<String> seen = new HashSet<>();
        for (Employee e : employeeList) {
            String key = e.getEmployeeId() + "_" + e.getName() + "_" + e.getClass().getSimpleName();
            if (seen.add(key)) {
                this.employeeList.add(e);
            }
        };
    }

    public void addEmployee(Employee employee){
        boolean found = false;
        for(Employee e : employeeList){
            if(e.getEmployeeId() == employee.getEmployeeId() && e.getName().equals(employee.getName())){
                found = true;
                break;
            }
        }
        if(!found){
            employeeList.add(employee);
        }
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String showDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append("Department : ").append(name).append("\n");
        for(Employee e : employeeList){
            sb.append(e.getName()).append(" (").append(e.getEmployeeId()).append(") : ").append(e.calculatePay()).append("\n");
        }
        return sb.toString();
    }
}
