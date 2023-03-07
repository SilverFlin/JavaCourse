package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> myCustomers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.myCustomers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name,double initialAmount){
        if(findCustomer(name)<0){
            myCustomers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public void newTransaction(String customer, double amount){
        if(findCustomer(customer) < 0){
            System.out.println("Customer not found");
        }else {
            myCustomers.get(findCustomer(customer)).setTransactions(amount);
        }
    }
    private int findCustomer(String customer){
        for (int i = 0 ; i<myCustomers.size(); i++){
            if(myCustomers.get(i).getName().equals(customer)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Customer> getMyCustomers() {
        return myCustomers;
    }
}

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.


// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions