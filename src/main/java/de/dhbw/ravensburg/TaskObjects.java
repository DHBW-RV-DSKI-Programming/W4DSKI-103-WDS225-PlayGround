package main.java.de.dhbw.ravensburg;

public class TaskObjects {

    public static void main(String[] args) {
        // Aufgabe 1: Person-Instanz erstellen und ausgeben
        Person person = new Person("Max Mustermann", 25);
        printPersonInfo(person);

        Car car = new Car("Porsche", "Taycan", 2018);
        car.showCarInfo();

        Person nullPerson = null;
        TaskObjects.printPersonInfo(nullPerson);

        // Aufgabe 2: String-Länge berechnen
        String text = "Hallo Welt";
        System.out.println("Länge von '" + text + "': " + getStringLength(text));

        // NullPointerException vermeiden
        String nullText = null;
        System.out.println("Länge von null-String: " + getStringLength(nullText));
    }

    public static void printPersonInfo(Person person) {
        if (person != null) {
            System.out.println("Name: " + person.name + ", Alter: " + person.age);
        } else {
            System.out.println("Fehler: Person-Instanz ist null!");
        }
    }

    public static int getStringLength(String text) {
        if (text != null) {
            return text.length();
        } else {
            System.out.println("Fehler: Der übergebene String ist null!");
            return -1;
        }
    }

}
