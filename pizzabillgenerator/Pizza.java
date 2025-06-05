package spark_batch.basic_projects.pizzabillgenerator;

public interface Pizza {
    void addExtraCheese();
    void addExtraToppings();
    void takeAway();
    String getBill();
}

