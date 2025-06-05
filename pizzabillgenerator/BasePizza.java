package spark_batch.basic_projects.pizzabillgenerator;

public class BasePizza implements Pizza {
    private final boolean isVeg;
    private final int basePrice;
    private int totalPrice;
    private final StringBuilder bill;
    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean takeAwayAdded = false;

    public BasePizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 200 : 300;
        this.totalPrice = basePrice;
        this.bill = new StringBuilder();
        bill.append("Base Pizza (").append(isVeg ? "Veg" : "Non-Veg").append("): ").append(basePrice).append("\n");
    }

    @Override
    public void addExtraCheese() {
        if (!cheeseAdded) {
            totalPrice += 100;
            bill.append("Extra Cheese: 100\n");
            cheeseAdded = true;
        }
    }

    @Override
    public void addExtraToppings() {
        if (!toppingsAdded) {
            totalPrice += 100;
            bill.append("Extra Toppings: 100\n");
            toppingsAdded = true;
        }
    }

    @Override
    public void takeAway() {
        if (!takeAwayAdded) {
            totalPrice += 20;
            bill.append("Take Away (Packing): 20\n");
            takeAwayAdded = true;
        }
    }

    @Override
    public String getBill() {
        bill.append("Total Price: ").append(totalPrice).append("\n");
        return bill.toString();
    }
}
