package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        TV myTv = new TV("Philips", new Dimensions(50,100));
        Chair myChair = new Chair("Red", "Tommy");
        Desk myDesk = new Desk("blue", "Tammy");
        Room myRoom = new Room(myTv,myChair,myDesk);

        myRoom.useTheChair();
        myRoom.useTheDesk();
        myRoom.useTheTV();

    }
}


// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Desk, Chair, Table, bed
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and

// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.