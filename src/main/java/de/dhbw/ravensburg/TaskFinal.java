package main.java.de.dhbw.ravensburg;

public class TaskFinal {

    public static void main(String[] args) {
        // Kreis testen
        Kreis kreis = new Kreis();
        double radius = 5.0;
        double flaeche = kreis.calculateArea(radius);
        System.out.println("Kreis mit Radius " + radius + " hat eine Fläche von: " + flaeche);

        // Vehicle testen
        Vehicle vehicle = new Vehicle();
        vehicle.driving();

        // Address testen
        Address address = new Address("Hauptstraße 123", "Ravensburg", "88212");
        System.out.println("Adresse: " + address.getStreet() + ", " +
                           address.getPostcode() + " " + address.getTown());
    }

}
