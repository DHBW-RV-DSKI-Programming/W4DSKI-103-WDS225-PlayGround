package main.java.de.dhbw.ravensburg;

abstract class TaskVehicle {
    protected String brand;

    public TaskVehicle(String brand) {
        this.brand = brand;
    }

    public void showBrand() {
        System.out.println("Marke: " + brand);
    }

    public abstract void driving();
}

interface EnergySource {
    String getEnergy();
}

class TaskCar extends TaskVehicle implements EnergySource {
    private String energyType;

    public TaskCar(String brand, String energyType) {
        super(brand);
        this.energyType = energyType;
    }

    @Override
    public void driving() {
        System.out.println("Das Auto " + brand + " fährt auf der Straße.");
    }

    @Override
    public String getEnergy() {
        return energyType;
    }
}

public class TaskInterface {

    public static void main(String[] args) {
        TaskCar car1 = new TaskCar("BMW", "Benzin");
        TaskCar car2 = new TaskCar("Tesla", "Elektrisch");

        System.out.println("=== Auto 1 ===");
        car1.showBrand();
        car1.driving();
        System.out.println("Energietyp: " + car1.getEnergy());

        System.out.println("\n=== Auto 2 ===");
        car2.showBrand();
        car2.driving();
        System.out.println("Energietyp: " + car2.getEnergy());
    }

}
