package spark_batch.basic_projects.pizzabillgenerator;

public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
