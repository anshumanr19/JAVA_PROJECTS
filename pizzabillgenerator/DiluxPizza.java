package spark_batch.basic_projects.pizzabillgenerator;

public class DiluxPizza extends Pizza{

    public DiluxPizza(boolean isVeg) {
        super(isVeg);
        addExtraToppings();
        addExtraCheese();
    }
}
