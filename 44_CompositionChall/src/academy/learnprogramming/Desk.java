package academy.learnprogramming;

public class Desk {
    private String color;
    private String name;

    public Desk(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    public void useTheDesk(){
        System.out.println("Using the desk...");
    }
}
