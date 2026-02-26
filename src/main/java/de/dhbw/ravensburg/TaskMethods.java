package main.java.de.dhbw.ravensburg;

public class TaskMethods {

    public static void main(String[] args) {
        printMessage();
        System.out.println("Durchschnitt von 10, 20, 30: " + calculateAverage(10, 20, 30));
        System.out.println("Umfang eines Kreises mit Radius 5: " + calculateCirclePerimeter(5));
        printNumbersUpToN(10);
        boolean bool = isPrime(7);
        System.out.println("Ist 7 eine Primzahl? " + bool);
        System.out.println("Ist 10 eine Primzahl? " + isPrime(10));
    }

    // Prozedur, die eine Nachricht auf der Konsole ausgibt
    public static void printMessage() {
        System.out.println("Hallo, das ist eine Nachricht!");
    }

    // Funktion, die den Durchschnitt von drei Zahlen berechnet
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Methode, die den Umfang eines Kreises berechnet
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // Prozedur, die alle Zahlen von 1 bis n auf der Konsole ausgibt
    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // Funktion, die prüft, ob eine Zahl eine Primzahl ist
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
