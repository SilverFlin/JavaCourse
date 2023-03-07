package academy.learnprogramming;

public class TV {
    private String model;
    private Dimensions dimensions;

    public TV(String model, Dimensions dimensions) {
        this.model = model;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    public void pressPowerButton(){
        System.out.println("powerButton pressed");
    }
}
