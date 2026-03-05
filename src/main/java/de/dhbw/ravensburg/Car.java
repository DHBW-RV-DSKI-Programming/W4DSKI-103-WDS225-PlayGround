package main.java.de.dhbw.ravensburg;

public class Car {

    private String brand;
    private String model;
    private int yearOfManufacture;

    public Car(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void showCarInfo() {
        System.out.println("Marke: " + brand + ", Modell: " + model + ", Baujahr: " + yearOfManufacture);
    }

    protected void describeState() {
        System.out.println("Das Auto fährt");
    }
}
