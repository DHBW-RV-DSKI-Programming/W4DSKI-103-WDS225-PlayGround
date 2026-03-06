package main.java.de.dhbw.ravensburg;

public class SpotifyPlaylist {

    static int amountOfficialPlaylists = 0;

    public SpotifyPlaylist() {
        amountOfficialPlaylists++;
    }

    public int holeWert() {
        return amountOfficialPlaylists;
    }

    static void macheIrgendwas() {
        System.out.println("Spotify");
    }

}
