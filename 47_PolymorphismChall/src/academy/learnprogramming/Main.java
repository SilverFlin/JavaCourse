package academy.learnprogramming;


class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }



    public String getName() {
        return name;
    }

    public String startEngine(){
        return "starEngine() called from Car class";
    }

    public String accelerate(){
        return "accelerate() called from Car class";
    }

    public String brake(){
        return "brake() called from Car class";
    }
}

class Timotty extends Car{
    public Timotty() {
        super(4, "Timotty");
    }
    @Override
    public String startEngine(){
        return "starEngine() called from Timotty class";
    }
    @Override
    public String accelerate(){
        return "accelerate() called from Timotty class";
    }
    @Override
    public String brake(){
        return "brake() called from Timotty class";
    }
}

class Pirpiru extends Car{
    public Pirpiru() {
        super(6, "Pirpiru");
    }
    @Override
    public String startEngine(){
        return "starEngine() called from Pirpiru class";
    }
    @Override
    public String accelerate(){
        return "accelerate() called from Pirpiru class";
    }
    @Override
    public String brake(){
        return "brake() called from Pirpiru class";
    }
}
class TimtimTomtom extends Car{
    public TimtimTomtom() {
        super(8, "TimtimTomtom");
    }


}



public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<11;i++){
            Car car = randomCar();
            System.out.println("#" + i + ": "+car.getName() +
                                "\n" + car.brake() + "\n" +
                    car.accelerate() +"\n" + car.startEngine());
            System.out.println("~~~~");
        }


    }
    public static Car randomCar(){



            int randomNumber = (int) (Math.random() * 3 + 1);
            System.out.println("Random number: " + randomNumber);
            switch (randomNumber){
                case 1:
                    return new Timotty();
                case 2:
                    return new Pirpiru();
                case 3:
                    return new TimtimTomtom();
            }
            return null;


    }
}

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).