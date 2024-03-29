package academy.learnprogramming;

public class Hamburger {

    private final String name;
    private final String meat;
    private final String breadRollType;
    private final double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;

//        Basic hamburger on a White roll with Sausage, price is 3.56
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " whit " + this.meat + ", price is: " + this.price);
        if (addition1Name != null){
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
            totalPrice += addition1Price;
        }

        if (addition2Name != null){
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
            totalPrice += addition2Price;
        }

        if (addition3Name != null){
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
            totalPrice += addition3Price;
        }

        if (addition4Name != null){
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
            totalPrice += addition4Price;
        }

        return totalPrice;
    }

}
/*For the base Hamburger class, there will need to be four variables to represent the four basic ingredients of the hamburger, name, meat, price, and breadRollType.
The price variable should be of type double, while the other three are of type String. A constructor will be needed to accept these four values as parameters when creating a new hamburger.

There will also need to be separate variables for four(4) possible additions to the hamburger.
Those should be declared with these names: addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name, and addition4Price.
The name variables should be of type String and the price variables should be of type double.

Five(5) methods are also needed inside the Hamburger class.
Four(4) for adding up to four additions to the hamburger and one(1) for printing out an itemized listing of the final hamburger with addons, if any, and the total price.
 Remember that a name and price must be accepted as parameters in the first four methods so that the price of the hamburger is adjusted accordingly.
 These methods should be named addHamburgerAddition1, addHamburgerAddition2, addHamburgerAddition3, addHamburgerAddition4, and itemizehamburger. The first four methods do
  not return values, but the last method does return the total price of the hamburger of type double, which includes the base price of the hamburger plus any additional items.

Example input:

Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
hamburger.addHamburgerAddition1("Tomato", 0.27);
hamburger.addHamburgerAddition2("Lettuce", 0.75);
hamburger.addHamburgerAddition3("Cheese", 1.13);
System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
healthyBurger.addHamburgerAddition1("Egg", 5.43);
healthyBurger.addHealthyAddition1("Lentils", 3.41);
System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

DeluxeBurger db = new DeluxeBurger();
db.addHamburgerAddition3("Should not do this", 50.53);
System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

Example output:

Basic hamburger on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71

Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is  14.51

Cannot not add additional items to a deluxe burger
Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
Total Deluxe Burger price is 19.10


 */