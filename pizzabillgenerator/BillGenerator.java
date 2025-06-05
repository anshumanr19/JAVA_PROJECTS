package spark_batch.basic_projects.pizzabillgenerator;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to pizza shop");
        System.out.print("Do you want a base pizza or dilux pizza : ");
        String pizzaType = in.nextLine();

        Pizza myPizza = null;

        if (pizzaType.equalsIgnoreCase("base")) {
            System.out.println("Veg? ");
            boolean isVeg = in.nextBoolean();
            if (isVeg) {
                myPizza = new Pizza(true);
            } else myPizza = new Pizza(false);

            System.out.println("Do you want extra cheese: ");
            boolean extraCheese = in.nextBoolean();
            if (extraCheese) myPizza.addExtraCheese();

            System.out.println("Do you want extra toppings: ");
            boolean extraTopping = in.nextBoolean();
            if (extraTopping) myPizza.addExtraToppings();

            System.out.println("Take away?");
            if (in.nextBoolean()) myPizza.takeAway();
        } else if (pizzaType.equalsIgnoreCase("dilux")){
            System.out.println("Veg or Non-veg? ");
            boolean isVeg = in.nextBoolean();
            if (isVeg) myPizza = new DiluxPizza(true);
            else myPizza = new DiluxPizza(false);

            System.out.println("Take away?");
            if (in.nextBoolean()) myPizza.takeAway();
        }

        myPizza.getBill();
    }
}
