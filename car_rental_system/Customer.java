package spark_batch.basic_projects.car_rental_system;

public class Customer {
    private String name;
    private String idNumber;

    public Customer(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }
}
