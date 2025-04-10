package spark_batch.basic_projects.car_showroom_management;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utils{
    String employeeID;
    String employeeDepartment;
    String employeeName;
    int employeeAge;

    @Override
    public void getDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Department: " + employeeDepartment);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Workplace Name: " + showroomName);
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employeeID = String.valueOf(uuid);
        System.out.println("============== *** Enter Employee Details *** ==============");
        System.out.println("\nEnter Workplace Name: ");
        showroomName = input.nextLine().trim();
        System.out.println("Enter Department: ");
        employeeDepartment = input.nextLine().trim();
        System.out.println("Enter Employee Name: ");
        employeeName = input.nextLine().trim();
        System.out.println("Enter Employee Age: ");
        employeeAge = input.nextInt();
    }
}
