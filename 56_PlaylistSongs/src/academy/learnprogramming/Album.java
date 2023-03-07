package academy.learnprogramming;

import java.util.ArrayList;

public class Album {

    private ArrayList<Song> songs;
    private String albumName;

    public Album(String albumName) {
        this.songs = new ArrayList<Song>();
        this.albumName = albumName;
    }

    public boolean addSong(Song song){
        if(!songs.contains(song)){
            songs.add(song);
            song.setAlbum(this);
            return true;
        }else{
            System.out.println("That song is currently on the Album: " + albumName);
            return false;
        }
    }

    public void printSongs() {
        for (int i = 0; i < songs.size(); i++) {
            Song curSong = songs.get(i);
            System.out.println((i+1) + ". |" + curSong.getTitle() + "|");
            System.out.println("       -> with duration of: " + curSong.getDuration() + " minutes");
        }

    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()