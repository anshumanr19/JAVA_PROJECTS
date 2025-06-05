package spark_batch.basic_projects.pizzabillgenerator;

public class DeluxPizza implements Pizza {
    private final Pizza basePizza;

    public DeluxPizza(Pizza basePizza) {
        this.basePizza = basePizza;
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        basePizza.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
        basePizza.addExtraToppings();
    }

    @Override
    public void takeAway() {
        basePizza.takeAway();
    }

    @Override
    public String getBill() {
        return basePizza.getBill();
    }

}


//public class DeluxPizza extends BasePizza {
//
//    public DeluxPizza(boolean isVeg) {
//        super(isVeg);
//        addExtraCheese();
//        addExtraToppings();
//    }
//}
