package spark_batch.basic_projects.employee_payroll_system;

import java.util.ArrayList;

public class EmployeePayrollSystem {
    private ArrayList<Employee> employeeList;

    public EmployeePayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) employeeList.remove(employeeToRemove);
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
