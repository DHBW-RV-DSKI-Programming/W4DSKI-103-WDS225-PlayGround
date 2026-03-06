package main.java.de.dhbw.ravensburg;

import java.util.ArrayList;
import java.util.List;

class ShoppingBasket {
    public static int MAX_ITEMS = 10;

    public static boolean isFull(int currentAmount) {
        return currentAmount >= MAX_ITEMS;
    }
}

class AppConfiguration {
    private static ArrayList<String> defaultLanguages = new ArrayList<>(List.of("Deutsch", "Englisch"));

    public static void addLanguages(String language) {
        defaultLanguages.add(language);
        System.out.println("Aktuelle Sprachen: " + defaultLanguages);
    }

    public static ArrayList<String> getDefaultLanguages() {
        return new ArrayList<>(defaultLanguages);
    }
}

public class TaskStatic {

    public static void main(String[] args) {
        // Test ShoppingBasket
        System.out.println("=== ShoppingBasket Tests ===");
        System.out.println("MAX_ITEMS: " + ShoppingBasket.MAX_ITEMS);
        System.out.println("isFull(5): " + ShoppingBasket.isFull(5));
        System.out.println("isFull(10): " + ShoppingBasket.isFull(10));
        System.out.println("isFull(12): " + ShoppingBasket.isFull(12));
        System.out.println("isFull(0): " + ShoppingBasket.isFull(0));

        // Test AppConfiguration
        System.out.println("\n=== AppConfiguration Tests ===");
        System.out.println("Initiale Sprachen: " + AppConfiguration.getDefaultLanguages());
        AppConfiguration.addLanguages("Französisch");
        AppConfiguration.addLanguages("Spanisch");
        AppConfiguration.addLanguages("Italienisch");
    }

}
