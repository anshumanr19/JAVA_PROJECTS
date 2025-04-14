package spark_batch.basic_projects.car_rental_system;

public class Car {
    private String carID;
    private String carModel;
    private String carBrand;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carID, String carModel, String carBrand, double pricePerDay) {
        this.carID = carID;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public double calculatePrice(int rentalDays) {
        return pricePerDay * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}
