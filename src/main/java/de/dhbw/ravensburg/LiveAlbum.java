package main.java.de.dhbw.ravensburg;

class LiveAlbum extends Album {

    int audienceParticipation;

    LiveAlbum(String albumName, int releaseYear, int audienceParticipation) {
        super(albumName, releaseYear); // Call the constructor of the parent class
        this.audienceParticipation = audienceParticipation;
    }

    void releaseAlbum() {
        System.out.println("Unique and performed live for the first time");
    }

    void releaseAlbum2() {
        System.out.println("Unique and performed live for the first time");
    }

}
