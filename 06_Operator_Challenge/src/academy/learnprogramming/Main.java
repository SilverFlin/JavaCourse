package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myDoubleResult = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("myDoubleResult = " + myDoubleResult);
        double myRemainder = myDoubleResult % 40.00d;
        System.out.println("myRemainder = " + myRemainder);
        boolean ResultZero = myRemainder == 0 ? true : false;
        System.out.println("ResultZero = " + ResultZero);
        System.out.println("myRemainder is equal to 0? " + ResultZero);
        if (!ResultZero) {
            System.out.println("Got some remainder");
        }
    }
}
