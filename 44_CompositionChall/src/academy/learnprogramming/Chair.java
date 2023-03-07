package academy.learnprogramming;

public class Chair {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Chair(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public void useTheChair(){
        System.out.println("Using the chair");
    }
}
