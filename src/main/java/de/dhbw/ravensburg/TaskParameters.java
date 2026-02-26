package main.java.de.dhbw.ravensburg;

import java.util.ArrayList;

public class TaskParameters {

    public static void main(String[] args) {
        // Pass-by-value Beispiel (primitive Datentypen)
        System.out.println("=== Pass-by-Value (Primitive) ===");
        int zahl = 10;
        System.out.println("Vor der Methode: zahl = " + zahl);
        aendereWert(zahl);
        System.out.println("Nach der Methode: zahl = " + zahl);
        
        System.out.println();
        
        // Pass-by-reference Beispiel (Objekte)
        System.out.println("=== Pass-by-Reference (Objekt) ===");
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Apfel");
        liste.add("Banane");
        System.out.println("Vor der Methode: liste = " + liste);
        aendereObjekt(liste);
        System.out.println("Nach der Methode: liste = " + liste);
    }
    
    // Methode 1: Verändert einen primitiven Wert
    public static void aendereWert(int zahl) {
        zahl = zahl + 5;
        System.out.println("In der Methode: zahl = " + zahl);
    }
    
    // Methode 2: Verändert ein Objekt
    public static void aendereObjekt(ArrayList<String> liste) {
        liste.add("Orange");
        System.out.println("In der Methode: liste = " + liste);
    }

}
