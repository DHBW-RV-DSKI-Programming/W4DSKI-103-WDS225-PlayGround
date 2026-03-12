package main.java.de.dhbw.ravensburg;


interface Searchable {
    String searchQuery = "SELECT * FROM";
}

interface TrackInterface {

}

interface MusicSearchable extends Searchable {

    String name = "Music";

    void search();

    default void searchByGenre(String genre) {
        System.out.println("Searching for " + genre + " songs");
    }

}

class TrackSearch implements MusicSearchable, TrackInterface {

    @Override
    public void search() {
        System.out.println("Searching for Iron Maiden songs");
    }

    // searchByGenre() is inherited

}

public class AppInterface {

    public static void main(String[] args) {
        MusicSearchable musicSearchable = new TrackSearch();
    }

}
