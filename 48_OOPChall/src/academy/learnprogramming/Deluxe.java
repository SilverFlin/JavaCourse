package academy.learnprogramming;

public class Deluxe extends Burger{
    private final String ERROR_MSG_DELUXE = "Deluxe has no more additions";
    public Deluxe(String breadRollType, String meat, double basePrice, String name) {
        super(breadRollType, meat, basePrice, name);
        super.setAddition1("chips");
        super.setAddition2("drink");
    }



    @Override
    public String getAddition3() {
        return ERROR_MSG_DELUXE;
    }

    @Override
    public String getAddition4() {
        return ERROR_MSG_DELUXE;
    }


    @Override
    public void setAddition1(String addition) {
        System.out.println(ERROR_MSG_DELUXE);
    }
    @Override
    public void setAddition2(String addition) {
        System.out.println(ERROR_MSG_DELUXE);
    }

    @Override
    public void setAddition3(String addition) {
        System.out.println(ERROR_MSG_DELUXE);
    }

    @Override
    public void setAddition4(String addition) {
        System.out.println(ERROR_MSG_DELUXE);
    }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.