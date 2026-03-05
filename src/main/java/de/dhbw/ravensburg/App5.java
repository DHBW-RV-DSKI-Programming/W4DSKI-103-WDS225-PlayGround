package main.java.de.dhbw.ravensburg;

import java.util.ArrayList;

public class App5 {

    public static void main(String[] args) {
        /*printMultipleMessages(5, "Arcane", "Dr. House", "House of the Dragon");

        String text = null;
        text.charAt(0);
         */

        ArrayList<Integer> num1 = new ArrayList<Integer>();
    }

    static void printMultipleMessages(int num, String... messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }

}
