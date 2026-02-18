package main.java.de.dhbw.ravensburg;

import java.util.Scanner;

public class TaskLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aufgabe 1: Erste 10 Fibonacci-Zahlen mit for-Schleife
        System.out.println("=== Aufgabe 1: Fibonacci-Zahlen (for-Schleife) ===");
        int n = 10;
        long first = 0, second = 1;
        System.out.print("Die ersten " + n + " Fibonacci-Zahlen: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        // Aufgabe 2: Zahl halbieren mit while-Schleife
        System.out.println("\n=== Aufgabe 2: Zahl halbieren (while-Schleife) ===");
        double zahl = 100.0;
        int schritte = 0;
        System.out.println("Startzahl: " + zahl);
        while (zahl >= 1) {
            System.out.println("Schritt " + (++schritte) + ": " + zahl);
            zahl = zahl / 2;
        }
        System.out.println("Endzahl (< 1): " + zahl);

        // Aufgabe 3: Passwort-Abfrage mit do-while-Schleife
        System.out.println("\n=== Aufgabe 3: Passwort-Abfrage (do-while-Schleife) ===");
        String korrektes = "geheim123";
        String eingabe;
        do {
            System.out.print("Bitte geben Sie das Passwort ein: ");
            eingabe = scanner.nextLine();
            if (!eingabe.equals(korrektes)) {
                System.out.println("Falsches Passwort! Versuchen Sie es erneut.");
            }
        } while (!eingabe.equals(korrektes));
        System.out.println("Passwort korrekt! Zugriff gewährt.");

        // Aufgabe 4: Fakultät berechnen mit for- und while-Schleife
        System.out.println("\n=== Aufgabe 4: Fakultät berechnen ===");
        int fakultaetZahl = 5;

        long fakultaetFor = 1;
        for (int i = 1; i <= fakultaetZahl; i++) {
            fakultaetFor *= i;
        }
        System.out.println("Fakultät von " + fakultaetZahl + " (for-Schleife): " + fakultaetFor);

        long fakultaetWhile = 1;
        int i = 1;
        while (i <= fakultaetZahl) {
            fakultaetWhile *= i;
            i++;
        }
        System.out.println("Fakultät von " + fakultaetZahl + " (while-Schleife): " + fakultaetWhile);

        // Aufgabe 5: break und continue in Schleifen
        System.out.println("\n=== Aufgabe 5: break und continue ===");
        System.out.println("Zahlen von 1 bis 20 (außer Vielfache von 3, Abbruch bei 15):");
        for (int j = 1; j <= 20; j++) {
            // Bei 15 abbrechen
            if (j == 15) {
                System.out.println("(Abbruch bei " + j + ")");
                break;
            }
            // Vielfache von 3 überspringen
            if (j % 3 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();

        // Aufgabe 6: Primzahl-Prüfung
        System.out.println("\n=== Aufgabe 6: Primzahl-Prüfung ===");
        System.out.print("Geben Sie eine Zahl ein: ");
        int primZahl = scanner.nextInt();
        boolean istPrim = true;
        if (primZahl <= 1) {
            istPrim = false;
        } else if (primZahl == 2) {
            istPrim = true;
        } else if (primZahl % 2 == 0) {
            istPrim = false;
        } else {
            // Prüfe nur ungerade Teiler bis zur Wurzel der Zahl
            for (int k = 3; k <= Math.sqrt(primZahl); k += 2) {
                if (primZahl % k == 0) {
                    istPrim = false;
                    break;
                }
            }
        }
        if (istPrim) {
            System.out.println(primZahl + " ist eine Primzahl.");
        } else {
            System.out.println(primZahl + " ist keine Primzahl.");
        }

        scanner.close();
    }
}
