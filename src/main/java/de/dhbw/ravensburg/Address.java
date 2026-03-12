package main.java.de.dhbw.ravensburg;

public final class Address {

    private final String street;
    private final String town;
    private final String postcode;

    public Address(String street, String town, String postcode) {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getPostcode() {
        return postcode;
    }
}
