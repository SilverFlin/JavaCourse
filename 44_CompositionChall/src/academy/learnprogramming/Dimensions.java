package academy.learnprogramming;

public class Dimensions {
    private int height;
    private int width;

    public Dimensions(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    private void getDimensions(){
        System.out.println("Dimensions: " + height + " x " + width);
    }
}
