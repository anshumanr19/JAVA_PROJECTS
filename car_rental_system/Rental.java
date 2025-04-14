package spark_batch.basic_projects.car_rental_system;

public class Rental {
    private Car car;
    private Customer customer;
    private int totalDays;

    public Rental(Car car, Customer customer, int totalDays) {
        this.car = car;
        this.customer = customer;
        this.totalDays = totalDays;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getTotalDays() {
        return totalDays;
    }
}
