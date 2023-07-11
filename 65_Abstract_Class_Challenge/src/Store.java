import java.util.ArrayList;

public class Store {


    private static ArrayList<ProductForSale> productsForSale = new ArrayList<>();

    /**
     * In this challenge, you need to build an application, that can be a store front, for any imaginable item for sale.
     * Instead of the Main class we usually create, create a Store class, with a main method.
     * The Store class should:
     * manage a list of products for sale, including displaying the product details.
     * manage an order, which can just be a list of OrderItem objects.
     * have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.
     * <p>
     * Create a ProductForSale class that should have at least three fields: a type, price, and a description, and should have methods to:
     * get a Sales Price, a concrete method, which takes a quantity, and returns the quantity times the price.
     * <p>
     * print a Priced Line Item, a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and line item price.
     * <p>
     * show Details, an abstract method, which represents what might be displayed on a product page, product type, description, price, and so on.
     * Create an OrderItem type, that has at a minimum 2 fields, quantity and a Product for Sale.
     * You should create two or three classes that extend the ProductForSale class, that will be products in your store.
     *
     * @param args
     */

    public static void main(String[] args) {
        productsForSale.add(new Cookies("food", 3.99, "Sandwich Cookies 400gr"));
        productsForSale.add(new Cookies("food", 4.99, "Sandwich Cookies 500gr"));
        productsForSale.add(new Cookies("food", 5.99, "Sandwich Cookies 650gr"));


        productsForSale.add(new Cheese("food", 3.49, "Cottage Cheese30gr"));
        productsForSale.add(new Cheese("food", 4.49, "Cottage Cheese40gr"));
        productsForSale.add(new Cheese("food", 5.49, "Cottage Cheese50gr"));

        listProducts();

        var order = new ArrayList<OrderItem>();

        order.add(new OrderItem(3, productsForSale.get(0)));
        order.add(new OrderItem(2, productsForSale.get(1)));
        order.add(new OrderItem(1, productsForSale.get(2)));
        order.add(new OrderItem(4, productsForSale.get(3)));
        order.add(new OrderItem(2, productsForSale.get(4)));
        order.add(new OrderItem(3, productsForSale.get(5)));

         var total = 0.0;


        for (OrderItem orderItem : order) {
            int qty = orderItem.quantity();
            ProductForSale product = orderItem.product();
            product.printPricedLineItem(qty);
            total += product.getSalesPrice(qty);
        }

        System.out.printf("Total: $%6.2f", total);


    }

    private static void listProducts() {
        for (ProductForSale product : productsForSale) {
            System.out.println(product.showDetails());
        }
    }
}
