package main.java.de.dhbw.ravensburg;


import java.util.ArrayList;

enum BrandType {
    AIRBUS,
    BOEING;
}

class Airplane {

    private int length;
    private String registrationId;
    private Double weight;
    private BrandType brandType;

    public Airplane(int length, String registrationId, Double weight, BrandType brandType) {
        this.length = length;
        this.registrationId = registrationId;
        this.weight = weight;
        this.brandType = brandType;
    }

}

class PrivateJet extends Airplane {

    private String owner;

    PrivateJet(int length, String registrationId, Double weight, BrandType brandType, String owner) {
        super(length, registrationId, weight, brandType);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

}

public class PolymorphieApp {

    public static void main(String[] args) {
        ArrayList<Airplane> jets = new ArrayList<>();
        jets.add(new PrivateJet(10, "D-12SDEW", 5.0, BrandType.AIRBUS, "Taylor Swift"));

        Airplane object = jets.get(0);
        PrivateJet privateJet = (PrivateJet) object;
        privateJet.getOwner();
    }

}
