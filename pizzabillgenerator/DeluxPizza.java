package spark_batch.basic_projects.pizzabillgenerator;

public class DeluxPizza extends BasePizza {

    public DeluxPizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }
}
