package academy.learnprogramming;

public class HealthyBurger extends  Burger{
    private final String ERROR_MAX = "Only 2 Additions for Healthy Burger";
    public HealthyBurger(String meat, double basePrice, String name) {
        super("Brown Rye Bread Roll", meat, basePrice, name);
    }

    @Override
    public String getAddition3() {
        System.out.println(ERROR_MAX);
        return null;
    }

    @Override
    public String getAddition4() {
        System.out.println(ERROR_MAX);

        return null;
    }

    @Override
    public void setAddition3(String addition) {
        System.out.println(ERROR_MAX);

    }

    @Override
    public void setAddition4(String addition) {
        System.out.println(ERROR_MAX);
    }
}

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type)