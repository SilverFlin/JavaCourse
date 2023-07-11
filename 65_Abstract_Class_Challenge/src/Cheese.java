public class Cheese extends ProductForSale{
    public Cheese(String type, Double price, String description) {
        super(type, price, description);
    }

    @Override
    String showDetails() {
        return this.getRelativeType() + " is a type of: " + this.type
                + "\n with a price of: " + this.price
                + "\n product description: " + this.description;
    }
}
