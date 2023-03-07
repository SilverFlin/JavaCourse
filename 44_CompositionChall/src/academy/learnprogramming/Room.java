package academy.learnprogramming;

public class Room {

    private TV tv;
    private Chair chair;
    private Desk desk;

    public Room(TV tv, Chair chair, Desk desk) {
        this.tv = tv;
        this.chair = chair;
        this.desk = desk;
    }

    public void useTheTV(){
        tv.pressPowerButton();
    }
    public void getTVDimensions(){
        tv.getDimensions();
    }
    public void useTheChair(){
        chair.useTheChair();
    }
    public void useTheDesk(){
        desk.useTheDesk();
    }

    public TV getTv() {
        return tv;
    }

    public Chair getChair() {
        return chair;
    }

    public Desk getDesk() {
        return desk;
    }
}
