package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Porsche silver = new Porsche();

    porscheValues(silver);

    }
    public static void porscheValues(Porsche porsche){
        System.out.println("Is nitro " + porsche.isNitro());
        System.out.println("Current Gear: " + porsche.getCurrentGear());
        System.out.println("Current Speed: " + porsche.getCurrentSpeed());
        System.out.println("Is in movement" + porsche.getInMovement());

        System.out.println();

        System.out.println("Increasing Speed...");
        porsche.increasingSpeed(10);
        System.out.println("Current Speed: " + porsche.getCurrentSpeed());

        System.out.println();
        System.out.println("Increasing Speed...");
        porsche.increasingSpeed(10);
        System.out.println("Current Speed: " + porsche.getCurrentSpeed());

        System.out.println();

        System.out.println("Decreasing Speed...");
        porsche.decreasingSpeed(5);
        System.out.println("Current Speed: " + porsche.getCurrentSpeed());

        System.out.println();

        System.out.println("Decreasing Speed...");
        porsche.decreasingSpeed(5);
        System.out.println("Current Speed: " + porsche.getCurrentSpeed());

        System.out.println();

        System.out.println("Increasing Gear...");
        porsche.gearIncrement();
        System.out.println("Current Gear: " + porsche.getCurrentGear());

        System.out.println();

        System.out.println("Increasing Gear...");
        porsche.gearIncrement();
        System.out.println("Current Gear: " + porsche.getCurrentGear());

        System.out.println();

        System.out.println("Decreasing Gear...");
        porsche.gearDecrease();
        System.out.println("Current Gear: " + porsche.getCurrentGear());

        System.out.println();

        System.out.println("Nitro Button...");
        porsche.nitroButton();
        System.out.println("Is nitro " + porsche.isNitro());

        System.out.println();

        System.out.println("Nitro Button...");
        porsche.nitroButton();
        System.out.println("Is nitro " + porsche.isNitro());

    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.