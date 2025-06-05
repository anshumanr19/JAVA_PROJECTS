package spark_batch.basic_projects.pizzabillgenerator;

public class Pizza {
    private final boolean isVeg;
    private final int basePrice;
    private int totalPrice;
    private final StringBuilder bill;
    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean takeAwayAdded = false;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 200 : 300;
        this.totalPrice = basePrice;
        this.bill = new StringBuilder();
        bill.append("Base Pizza (").append(isVeg ? "Veg" : "Non-Veg").append("): ").append(basePrice).append("\n");
    }

    public void addExtraCheese() {
        if (!cheeseAdded) {
            bill.append("Extra Cheese: 100\n");
            totalPrice += 100;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!toppingsAdded) {
            bill.append("Extra Toppings: 100\n");
            totalPrice += 100;
            toppingsAdded = true;
        }
    }

    public void takeAway() {
        if (!takeAwayAdded) {
            bill.append("Take Away (Packing): 20\n");
            totalPrice += 20;
            takeAwayAdded = true;
        }
    }

    public String getBill() {
        bill.append("Total Price: ").append(totalPrice).append("\n");
        return bill.toString();
    }
}
