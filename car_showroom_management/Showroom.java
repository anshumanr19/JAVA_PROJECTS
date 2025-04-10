package spark_batch.basic_projects.car_showroom_management;

import java.util.Scanner;

public class Showroom implements Utils{
    String showroomName;
    String showroomAddress;
    String managerName;
    int totalEmployees;
    int totalCarsInStock;

    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAddress);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Cars in Stock: " + totalCarsInStock);
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("======================= *** Enter Showroom Details *** =======================");
        System.out.println("\nEnter Showroom Name: ");
        showroomName = input.nextLine().trim();
        System.out.println("Enter Showroom Address: ");
        showroomAddress = input.nextLine();
        System.out.println("Enter Manager Name: ");
        managerName = input.nextLine().trim();
        System.out.println("Enter Total no. of Employees: ");
        totalEmployees = input.nextInt();
        System.out.println("Enter Total cars available in the stock: ");
        totalCarsInStock = input.nextInt();
    }
}
