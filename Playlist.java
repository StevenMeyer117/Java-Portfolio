/*
Desert Island Playlist project allows an individual to bring a playlist with them as they head to an isolated island.
Build a playlist to store the best possible music using Java Arrays and ArrayList
 */

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        // Create array of favorite songs
        String[] favoriteSongs = {"Red Hot Chili Peppers - Hard to Concentrate", "Red Hot Chili Peppers - Wet Sand",
                "Red Hot Chili Peppers - Don't Forget Me", "Fuel - Hemorrhage (In My Hands)",
                "Keith Urban - Stupid Boy", "Temple of the Dog - Hunger Strike", "The Wallflowers - Closer to You",
                "Rise Against - Everchanging", "Seven Mary Three - Water's Edge", "Audioslave - Shadow on the Sun"};

        // Print out first three songs
        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        // Create desert island playlist Array List and add 5 songs
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Pearl Jam - Last Kiss");
        desertIslandPlaylist.add("Mumford & Sons - The Wolf");
        desertIslandPlaylist.add("A Day To Remember - If It Means a Lot to You");
        desertIslandPlaylist.add("Breaking Benjamin - Breath");
        desertIslandPlaylist.add("Smashing Pumpkins - Disarm");

        System.out.println(desertIslandPlaylist);

        // Add favoriteSongs songs to desertIslandPlaylist
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.size();
        System.out.println(desertIslandPlaylist.size());

        // I can't bring more than 10 songs. Remove 5 songs
        desertIslandPlaylist.remove("Audioslave - Shadow on the Sun");
        desertIslandPlaylist.remove("Seven Mary Three - Water's Edge");
        desertIslandPlaylist.remove("Rise Against - Everchanging");
        desertIslandPlaylist.remove("The Wallflowers - Closer to You");
        desertIslandPlaylist.remove("Temple of the Dog - Hunger Strike");

        System.out.println(desertIslandPlaylist);

        // Select two songs, store their indices inside variables Song A and Song B
        desertIslandPlaylist.indexOf("Pearl Jam - Last Kiss");
        desertIslandPlaylist.indexOf("Keith Urban - Stupid Boy");
        System.out.println(desertIslandPlaylist.indexOf("Pearl Jam - Last Kiss"));
        System.out.println(desertIslandPlaylist.indexOf("Keith Urban - Stupid Boy"));

        desertIslandPlaylist.set(0, "Song A");
        desertIslandPlaylist.set(9, "Song B");

        // Using temp variable, replace Song A with Song B
        String tempA = "Song A";
        desertIslandPlaylist.set(0, "Song B");

        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(9, tempA);
        System.out.println(desertIslandPlaylist);
    }
}