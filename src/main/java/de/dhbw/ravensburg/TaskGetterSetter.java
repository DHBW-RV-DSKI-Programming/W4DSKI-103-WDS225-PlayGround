package main.java.de.dhbw.ravensburg;

public class TaskGetterSetter {

    public static void main(String[] args) {
        // Test Account-Klasse
        System.out.println("=== Account Tests ===");
        Account account = new Account(100.0);
        System.out.println("Anfangsguthaben: " + account.getBalance() + "€");

        account.deposit(50.0);
        System.out.println("Nach Einzahlung von 50€: " + account.getBalance() + "€");

        account.withdraw(30.0);
        System.out.println("Nach Abhebung von 30€: " + account.getBalance() + "€");

        // Validierungstests
        account.deposit(-20.0);  // Sollte abgelehnt werden
        account.withdraw(200.0);  // Sollte abgelehnt werden (nicht genug Guthaben)

        System.out.println("Endguthaben: " + account.getBalance() + "€");

        // Test Person-Klasse
        System.out.println("\n=== Person Tests ===");
        PersonGetterSetter person = new PersonGetterSetter("Max Mustermann", 25);
        System.out.println(person);

        person.setAge(30);
        System.out.println("Nach Altersänderung auf 30: " + person);

        // Validierungstests
        person.setAge(-5);   // Sollte abgelehnt werden
        person.setAge(150);  // Sollte abgelehnt werden
        person.setAge(120);  // Grenzwert sollte akzeptiert werden
        System.out.println("Nach Grenzwert-Tests: " + person);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Warnung: Negatives Anfangsguthaben nicht erlaubt. Auf 0€ gesetzt.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Einzahlung erfolgreich: +" + amount + "€");
        } else {
            System.out.println("Fehler: Einzahlungsbetrag muss positiv sein!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Abhebung erfolgreich: -" + amount + "€");
            } else {
                System.out.println("Fehler: Nicht genügend Guthaben! (Verfügbar: " + balance + "€)");
            }
        } else {
            System.out.println("Fehler: Abhebungsbetrag muss positiv sein!");
        }
    }
}

class PersonGetterSetter {

    private String name;
    private int age;

    public PersonGetterSetter(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Fehler: Name darf nicht leer sein!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Fehler: Alter muss zwischen 0 und 120 liegen! (Eingabe: " + age + ")");
        }
    }

}
