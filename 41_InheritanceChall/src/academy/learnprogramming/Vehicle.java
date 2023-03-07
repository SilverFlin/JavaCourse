package academy.learnprogramming;

public class Vehicle {

    private double currentSpeed;
    private String name;

    public Vehicle() {
        this(0, "DefaultName");
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(double currentSpeed, String name) {
        this.currentSpeed = currentSpeed;
        this.name = name;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void increasingSpeed(double amount){
        this.currentSpeed += amount;
    }
    public void decreasingSpeed(double amount){
        this.currentSpeed -= amount;
    }

    public boolean getInMovement () {
        return this.currentSpeed != 0;
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.