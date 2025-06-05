package spark_batch.basic_projects.pizzabillgenerator;

public class Pizza {
    private double price;
    private boolean isVeg;

    public Pizza(boolean isVeg) {
        if (isVeg) {
            this.price = 200;
        } else {
            this.price = 300;
        }
    }

    void addExtraCheese() {
        System.out.println("Extra cheese added.");
        this.price += 100;
    }
    void addExtraToppings() {
        System.out.println("Extra toppings added.");
        this.price += 100;
    }
    void takeAway() {
        System.out.println("Packing your pizza.");
        this.price += 20;
    }

    public void getBill() {
        System.out.println("Your bill is : " + this.price);
//        System.out.println();
    }
}
