package spark_batch.basic_projects.pizzabillgenerator;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("🍕 Welcome to the Pizza Shop!");
        System.out.print("Choose your pizza type (Base/Delux): ");
        String pizzaType = in.nextLine().trim();

        Pizza myPizza = null;

        if (pizzaType.equalsIgnoreCase("base")) {
            System.out.print("Do you want a Veg pizza? (true/false): ");
            boolean isVeg = in.nextBoolean();
            myPizza = new BasePizza(isVeg);

            System.out.print("Add extra cheese? (true/false): ");
            if (in.nextBoolean()) myPizza.addExtraCheese();

            System.out.print("Add extra toppings? (true/false): ");
            if (in.nextBoolean()) myPizza.addExtraToppings();

            System.out.print("Do you want take away? (true/false): ");
            if (in.nextBoolean()) myPizza.takeAway();

        } else if (pizzaType.equalsIgnoreCase("delux")) {
            System.out.print("Do you want a Veg Delux pizza? (true/false): ");
            boolean isVeg = in.nextBoolean();
            myPizza = new DeluxPizza(new BasePizza(isVeg));

            System.out.print("Do you want take away? (true/false): ");
            if (in.nextBoolean()) myPizza.takeAway();
        } else {
            System.out.println("Invalid pizza type selected.");
            in.close();
            return;
        }

        System.out.println("\n====== 🧾 Final Bill ======");
        System.out.println(myPizza.getBill());

        in.close();
    }
}
