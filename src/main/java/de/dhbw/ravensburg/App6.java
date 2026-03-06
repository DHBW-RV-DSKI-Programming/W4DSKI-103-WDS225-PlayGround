package main.java.de.dhbw.ravensburg;

public class App6 {

    public static void main(String[] args) {
        System.out.println(SpotifyPlaylist.amountOfficialPlaylists);
        SpotifyPlaylist playlist = new SpotifyPlaylist();
        System.out.println(SpotifyPlaylist.amountOfficialPlaylists);
        PopPlaylist popPlaylist = new PopPlaylist();
        System.out.println(PopPlaylist.amountOfficialPlaylists);

        SpotifyPlaylist.macheIrgendwas();
        PopPlaylist.macheIrgendwas();
    }

}
