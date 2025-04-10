package spark_batch.basic_projects.car_showroom_management;

import java.util.Scanner;

public class Cars extends Showroom implements Utils{
    String carName;
    String carColor;
    String fuelType;
    String carType;
    String carTransmission;
    int carPrice;

    @Override
    public void getDetails() {
        System.out.println("Name: " + carName);
        System.out.println("Color: " + carColor);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Car Type: " + carType);
        System.out.println("Transmission: " + carTransmission);
        System.out.println("Price: " + carPrice);
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("=============== *** Enter Car Details *** ===============");
        System.out.println("\nEnter Car Name: ");
        carName = input.nextLine().trim();
        System.out.println("Enter car color: ");
        carColor = input.nextLine().trim();
        System.out.println("Enter Fuel type[petrol/diesel]: ");
        fuelType = input.nextLine().trim();
        System.out.println("Enter car type[sedan/suv/hatchback]: ");
        carType = input.nextLine().trim();
        System.out.println("Enter transmission type[automatic/manual]: ");
        carTransmission = input.nextLine().trim();
        totalCarsInStock++;
    }
}
