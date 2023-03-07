package academy.learnprogramming;

public class Burger {
    private double basePrice;
    private double additionsPrice;
    private String name;
    private String breadRollType;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private String ERROR_ADDITION = "<--  ~ Product not Found ~";


    public Burger(String breadRollType, String meat, double basePrice, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition1() {
      if(checkerAndPrice(addition1) == 0){
          return ERROR_ADDITION;
      }else{
          return addition1;
      }
    }

    public String getAddition2() {
        if(checkerAndPrice(addition2) == 0){
            return ERROR_ADDITION;
        }else{
            return addition2;
        }
    }

    public String getAddition3() {
        if(checkerAndPrice(addition3) == 0){
            return ERROR_ADDITION;
        }else{
            return addition3;
        }
    }

    public String getAddition4() {
        if(checkerAndPrice(addition4) == 0){
            return ERROR_ADDITION;
        }else{
            return addition4;
        }
    }

    public void setAddition1(String addition) {
        addition1 = addition;
        additionsPrice += checkerAndPrice(addition);
    }

    public void setAddition2(String addition) {
        addition2 = addition;
        additionsPrice += checkerAndPrice(addition);

    }

    public void setAddition3(String addition) {
        addition3 = addition;
        additionsPrice += checkerAndPrice(addition);

    }

    public void setAddition4(String addition) {
        addition4 = addition;
        additionsPrice += checkerAndPrice(addition);

    }

    public double getAdditionsPrice() {
        return additionsPrice;
    }
    public double getTotal() {
        return additionsPrice + basePrice;
    }

    private double checkerAndPrice(String addition){
        String adtn = addition.toLowerCase();
        double additionPrice = 0;
        if (adtn.equals("lettuce") || adtn.equals("tomatoe") || adtn.equals("carrot") || adtn.equals("chilli")
                || adtn.equals("drink")  || adtn.equals("chips")){

            switch(adtn){
                case "lettuce":
                    System.out.println("Letuce: = +$0.50");
                    additionPrice = 0.5;
                    break;
                case "tomatoe":
                    System.out.println("Tomatoe: = +$0.80");
                    additionPrice = 0.8;
                    break;
                case "carrot":
                    System.out.println("Carrot: = +$1.50");
                    additionPrice = 1.5;

                    break;
                case "chilli":
                    System.out.println("Lettuce: = +$2.00");
                    additionPrice = 2.0;
                    break;
                case "drink":
                    System.out.println("Drink: = +$6.00");
                    additionPrice = 6.0;
                    break;
                case "chips":
                    System.out.println("Chips: = +$9.99");
                    additionPrice = 9.99;
                    break;
            }
        }else{
            System.out.println("Addition not found + $0.00");
            additionPrice = 0;
        }
        return additionPrice;
    }
}

// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.


// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.