package main.java.de.dhbw.ravensburg;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 18; i++) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        while (!password.equals("geheim123")) {
            System.out.println("Bitte geben Sie das korrekte Passwort ein");
            password = sc.nextLine();
        }


    }

}
