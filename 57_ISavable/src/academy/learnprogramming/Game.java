package academy.learnprogramming;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Game implements ISavable{

    ArrayList<String> players;
    ArrayList<String> monsters;

    public Game(ArrayList<String> players, ArrayList<String> monsters) {
        this.players = players;
        this.monsters = monsters;
    }

    @Override
    public boolean save(ArrayList<String> storage) {
        storage.addAll(this.returnData());
        System.out.println("Saved: " + this.toString());
        return true;

    }

    @Override
    public ArrayList<String> returnData() {
        ArrayList<String> allData = new ArrayList<>();
        allData.addAll(players);
        allData.addAll(monsters);
        return allData;
    }

    @Override
    public String toString() {
        return "Players: " + this.players.toString() + " & Monsters: " + this.monsters.toString();
    }
}

// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.
