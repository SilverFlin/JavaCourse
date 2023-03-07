package academy.learnprogramming;

public class Car extends Vehicle {

    private int currentGear;

    public Car() {
        this(0,0,"Default Car Name");
    }
    public Car(int currentGear){
        this(0,currentGear, "Default Car Name");
    }

    public Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    public Car(double currentSpeed, String name, int currentGear) {
        super(currentSpeed, name);
        this.currentGear = currentGear;
    }


    public Car(double currentSpeed, int currentGear, String name) {
        super(currentSpeed, name);
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    public void gearIncrement(){
        if (this.currentGear>6){
            System.out.println("Max Gear");
        }else{
            this.currentGear++;
        }
    }
    public void gearDecrease(){
        if (this.currentGear == 0){
            System.out.println("Min Gear");
        }else{
            this.currentGear--;
        }
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.