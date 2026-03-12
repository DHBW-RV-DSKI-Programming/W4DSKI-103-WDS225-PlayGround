package main.java.de.dhbw.ravensburg;

record Point(int x, int y) {
}

record Book(String title, String author, int pages) {
    public void describeBook() {
        System.out.println("Das Buch \"" + title + "\" wurde von " + author + " geschrieben und hat " + pages + " Seiten.");
        System.out.printf("Das Buch \"%s\" wurde von \"%s\" geschrieben und hat \"%s\" Seiten.", title, author, pages);
    }
}

public class TaskRecord {

    public static void main(String[] args) {
        System.out.println("=== Point Record ===");
        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 10);
        Point p3 = new Point(3, 7);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("\np1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3));   // false

        System.out.println("\np1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("p3.hashCode(): " + p3.hashCode());
        System.out.println("Gleiche Objekte haben gleichen HashCode: " + (p1.hashCode() == p2.hashCode()));

        System.out.println("\n=== Book Record ===");
        Book book = new Book("Der Herr der Ringe", "J.R.R. Tolkien", 1216);
        book.describeBook();

        System.out.println("\nTitel: " + book.title());
        System.out.println("Autor: " + book.author());
        System.out.println("Seiten: " + book.pages());
    }

}
