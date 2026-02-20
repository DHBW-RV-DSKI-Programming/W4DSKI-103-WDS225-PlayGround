package main.java.de.dhbw.ravensburg;

import java.util.ArrayList;
import java.util.Random;

public class TaskDataStructures {

    public static void main(String[] args) {
        // Aufgabe 1: Array mit forEach-Schleife - Summe und Durchschnitt
        System.out.println("=== Aufgabe 1: Array Summe und Durchschnitt ===");
        int[] zahlenArray = {12, 45, 23, 78, 34, 56, 89, 11, 67, 90};
        int summe = 0;

        for (int zahl : zahlenArray) {
            summe += zahl;
        }

        double durchschnitt = (double) summe / zahlenArray.length;
        System.out.println("Summe aller Elemente: " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);

        // Aufgabe 2: ArrayList mit Zufallszahlen - nur gerade Zahlen ausgeben
        System.out.println("\n=== Aufgabe 2: ArrayList mit Zufallszahlen ===");
        ArrayList<Integer> zufallsListe = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            zufallsListe.add(random.nextInt(100) + 1);
        }

        System.out.println("Alle Zufallszahlen: " + zufallsListe);
        System.out.print("Nur gerade Zahlen: ");

        for (int zahl : zufallsListe) {
            if (zahl % 2 == 0) {
                System.out.print(zahl + " ");
            }
        }
        System.out.println();

        // Aufgabe 3: 2D-Array transponieren
        System.out.println("\n=== Aufgabe 3: 2D-Array transponieren ===");
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original-Array:");
        for (int[] zeile : original) {
            System.out.print("(");
            for (int j = 0; j < zeile.length; j++) {
                System.out.print(zeile[j]);
                if (j < zeile.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        // Transponieren
        int zeilen = original.length;
        int spalten = original[0].length;
        int[][] transponiert = new int[spalten][zeilen];

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                transponiert[j][i] = original[i][j];
            }
        }

        System.out.println("\nTransponiertes Array:");
        for (int[] zeile : transponiert) {
            System.out.print("(");
            for (int j = 0; j < zeile.length; j++) {
                System.out.print(zeile[j]);
                if (j < zeile.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }

}
