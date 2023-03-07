package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Song> myPlaylist = new LinkedList<Song>();


        Album album1 = new Album("Little Dark Age");
        Song song1 = new Song("James",4);
        Song song2= new Song("Me and Michael",5);
        Song song3= new Song("When You're Small",3);
        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);

        Album album2 = new Album("Ugly is Beautiful");
        Song song01 = new Song("Lies Came Out My Mouth",2);
        Song song02 = new Song("Again & Again",3);
        Song song03 = new Song("1993",3);
        album2.addSong(song01);
        album2.addSong(song02);
        album2.addSong(song03);

        myPlaylist.add(song1);
        myPlaylist.add(song3);
        myPlaylist.add(song01);
        myPlaylist.add(song2);
        myPlaylist.add(song03);
        myPlaylist.add(song02);



        playPlaylist(myPlaylist);






    }

    private static void playPlaylist(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;
        boolean goingForwards = true;
        ListIterator<Song> playlistLinked = playlist.listIterator();
        while(!isQuit){
            switch (option){
                case 0:
                    printOptions();
                    break;
                case 1:
                    if (!goingForwards && playlistLinked.hasNext())  playlistLinked.next();

                    if (playlistLinked.hasNext()){
                        //The linked list is not working when next is executed fixme
                        System.out.println("Now Playing ");
                        printSong(playlistLinked.next());
                        System.out.println("~~~");
                    }else{
                        System.out.println("End of the playlist");
                    }
                    goingForwards = true;
                    break;
                case 2:
                    if (goingForwards && playlistLinked.hasPrevious()){
                        playlistLinked.previous();
                    }


                    if (playlistLinked.hasPrevious()){
                        System.out.println("Now Playing");
                        printSong(playlistLinked.previous());
                    }else{
                        System.out.println("Start of the playlist");
                    }
                    goingForwards = false;

                    break;
                case 3:
                    goingForwards = false;
                    if (!playlistLinked.hasPrevious()) {
                        playlistLinked.next();
                    }
                    System.out.println("Now Playing");
                    printSong(playlistLinked.previous());
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    if(printPlaylist(playlist)){
                        System.out.println("Choose an song by number");
                        int deleteSong = sc.nextInt();
                        sc.nextLine();
                        try{
                            playlist.remove(playlist.get(deleteSong-1));
                            playlistLinked = playlist.listIterator();
                        }catch(Exception e){
                            System.out.println("Invalid index");
                        }
                    }


                    break;
                case 6:
                    System.out.println("Quiting...");
                    isQuit = true;
                    break;
            }
            if (!isQuit){
                System.out.println("Choose an option");
                option = sc.nextInt();
                sc.nextLine();
            }

        }
    }

    private static void printSong(Song song){
        System.out.println("Title: " + song.getTitle() + "\n" +
                            "Duration: " + song.getDuration() + "\n" +
                            "Album: " + song.getAlbum().getAlbumName());

    }

    private static void printOptions() {
        System.out.println("0 -> Print Options \n" +
                "1 -> Skip Current Song \n" +
                "2 -> Skip Backwards \n" +
                "3 -> Replay Song \n" +
                "4 -> Print Playlist\n" +
                "5 -> Show the songs on the playlist\n" +
                "6 -> Quit");
    }

    private static boolean printPlaylist(LinkedList<Song> playlist) {
        if (playlist.isEmpty()){
            System.out.println("Playlist Empty");
            return false;
        }
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println("Song "+(i+1) + ". " + playlist.get(i).getTitle());
            System.out.println("    Album: " + playlist.get(i).getAlbum().getAlbumName());
        }
        return true;
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
// (hint: listiterator.remove())