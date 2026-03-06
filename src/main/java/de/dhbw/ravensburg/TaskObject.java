package main.java.de.dhbw.ravensburg;

public class TaskObject {

    public static void main(String[] args) {
        // Erstelle zwei Soundtrack-Objekte mit denselben Attributen
        Soundtrack soundtrack1 = new Soundtrack("Bohemian Rhapsody", "Queen", 354);
        Soundtrack soundtrack2 = new Soundtrack("Bohemian Rhapsody", "Queen", 354);

        // Teste toString()
        System.out.println("Soundtrack 1: " + soundtrack1);
        System.out.println("Soundtrack 2: " + soundtrack2);

        // Teste equals()
        System.out.println("\nSind die Soundtracks gleich? " + soundtrack1.equals(soundtrack2));

        // Teste hashCode()
        System.out.println("HashCode Soundtrack 1: " + soundtrack1.hashCode());
        System.out.println("HashCode Soundtrack 2: " + soundtrack2.hashCode());
        System.out.println("HashCodes gleich? " + (soundtrack1.hashCode() == soundtrack2.hashCode()));

        // Teste mit unterschiedlichem Soundtrack
        Soundtrack soundtrack3 = new Soundtrack("Hotel California", "Eagles", 391);
        System.out.println("\nSoundtrack 3: " + soundtrack3);
        System.out.println("Soundtrack 1 gleich Soundtrack 3? " + soundtrack1.equals(soundtrack3));
    }

}
