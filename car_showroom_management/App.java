package spark_batch.basic_projects.car_showroom_management;

import java.util.Scanner;

public class App {
    public static void menu() {
        System.out.println("\n========== *** Welcome to Showroom Management System *** ==========");
        System.out.println("\n========== *** Choose from below *** ==========");
        System.out.println("\n1. Add showroom\t\t\t2. Add employees\t\t\t3. Add cars\n4. Get showrooms\t\t\t5.Get employees\t\t\t6. Get cars");
        System.out.println("\n\n========== *** Enter 0 to exit *** ==========");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] cars = new Cars[5];

        int carCounter = 0;
        int employeesCounter = 0;
        int showroomCounter = 0;
        int choice = 1;
        while (choice != 0){
            menu();
            choice = input.nextInt();
            while (choice != 7 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println("\n1. Add new showroom");
                        System.out.println("7. Go back to main menu");
                        choice = input.nextInt();
                        break;
                    case 2:
                        employees[employeesCounter] = new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println("\n2. Add new employee");
                        System.out.println("7. Go back to main menu");
                        choice = input.nextInt();
                        break;
                    case 3:
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                        System.out.println("\n3. Add new car");
                        System.out.println("9. Go back to main menu");
                        choice = input.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].getDetails();
                            System.out.println();
                        }
                        System.out.println("\n7. Go back to main menu");
                        System.out.println("0. Exit");
                        choice = input.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employeesCounter; i++) {
                            employees[i].getDetails();
                            System.out.println();
                        }
                        System.out.println("\n7. Go back to main menu");
                        System.out.println("0. Exit");
                        choice = input.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            cars[i].getDetails();
                            System.out.println();
                        }
                        System.out.println("\n7. Go back to main menu");
                        System.out.println("0. Exit");
                        choice = input.nextInt();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
