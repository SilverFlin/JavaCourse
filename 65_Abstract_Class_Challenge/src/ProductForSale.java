public abstract class ProductForSale {

    protected String type;
    protected Double price;
    protected String description;

    public ProductForSale(String type, Double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final double getSalesPrice(int qty) {
        return qty * this.price;
    }

    public final void printPricedLineItem(int qty) {
        System.out.printf("Item: %s Quantity: %2d - Price: %s %n",getRelativeType(), qty, getSalesPrice(qty));
    }

    abstract String showDetails();

   public final String getRelativeType(){
        return getClass().getTypeName();
    }
}

