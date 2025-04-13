package spark_batch.basic_projects.employee_payroll_system;

public class Main {
    public static void main(String[] args) {
        EmployeePayrollSystem employeePayrollSystem = new EmployeePayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Vikas", 1123, 15000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Subhi", 1122,4, 200);
        employeePayrollSystem.addEmployee(emp1);
        employeePayrollSystem.addEmployee(emp2);
        employeePayrollSystem.displayEmployees();
        System.out.println("-------------------------------------------------");
        employeePayrollSystem.removeEmployee(1123);
        employeePayrollSystem.displayEmployees();
    }
}
