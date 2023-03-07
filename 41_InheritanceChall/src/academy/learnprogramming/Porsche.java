package academy.learnprogramming;

public class Porsche extends Car{
    private boolean nitro;

    public Porsche() {
        this(0,0,false);

    }

    public Porsche(boolean nitro) {
        this.nitro = nitro;
    }

    public Porsche(int currentGear, boolean nitro) {
        super(currentGear);
        this.nitro = nitro;
    }

    public Porsche(String name, int currentGear, boolean nitro) {
        super(name, currentGear);
        this.nitro = nitro;
    }

    public Porsche(double currentSpeed, String name, int currentGear, boolean nitro) {
        super(currentSpeed, name, currentGear);
        this.nitro = nitro;
    }

    public Porsche(double currentSpeed, int currentGear, String name, boolean nitro) {
        super(currentSpeed, currentGear, name);
        this.nitro = nitro;
    }

    public Porsche(double currentSpeed, int currentGear, boolean nitro) {
        super(currentSpeed,currentGear, "Default Name");
        this.nitro = nitro;
    }

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }
    public void nitroButton(){
        this.nitro = !nitro;
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.