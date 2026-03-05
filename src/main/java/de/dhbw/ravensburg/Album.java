package main.java.de.dhbw.ravensburg;

class Album {

    private String albumName;
    private int releaseYear;

    public Album(String albumName, int releaseYear) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
    }

    void releaseAlbum() {
        System.out.println("Album release");
    }

}

