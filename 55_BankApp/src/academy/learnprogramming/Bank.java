package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Branch> myBranches;

    public Bank() {
        this.myBranches = new ArrayList<Branch>();
    }

    public boolean addBranch(Branch newBranch){
        if(findBranch(newBranch)<0){
            myBranches.add(newBranch);
            return true;
        }else{
            System.out.println("Existing branch");
            return false;
        }

    }

    public boolean addCustomer(Branch branch, String name, double amount){
        if(checkBranch(branch)){
            Branch myBranch = myBranches.get(findBranch(branch));
            if(findCustomer(myBranch,name)<0){
                myBranches.get(findBranch(branch)).addCustomer(name, amount);
                return true;
            }else{
                System.out.println("Existing Customer");
                return false;
            }
        }else return false;


    }

    public boolean addTransaction(Branch branch, String customerName,double amount){
        if (checkBranch(branch) || checkCustomer(branch,customerName)){
            myBranches.get(findBranch(branch)).newTransaction(customerName,amount);
            return true;
        } else return false;
    }

    public void showCustomers(Branch branch){
        Scanner sc = new Scanner(System.in);
        if (checkBranch(branch)){
            for (int i = 0; i < myBranches.size(); i++) {
                ArrayList<Customer> customer = myBranches.get(findBranch(branch)).getMyCustomers();
                System.out.println(customer.get(i).getName());
                System.out.println("Get Transactions? Y/n");
                String answer = sc.nextLine();
                if(answer.equals("Y")|| answer.equals("y")){
                    int k = 0;
                    for (int j = 0; j < customer.size(); j++) {
                        System.out.println(customer.get(j).getTransactions().get(k));
                        k++;
                    }
                }
            }
        }

    }

    private boolean checkBranch(Branch branch){
        return (findBranch(branch) >= 0);
    }
    private boolean checkCustomer(Branch branch,String name){
        return findCustomer(branch,name)>=0;
    }

    private int findBranch(Branch branch){
        for (int i = 0 ; i<myBranches.size(); i++){
            if(myBranches.get(i).equals(branch)){
                return i;
            }
        }
        return -1;
    }
    private int findCustomer(Branch branch, String customer){
        ArrayList<Customer> myCustomers = myBranches.get(findBranch(branch)).getMyCustomers();
        for (int i = 0 ; i<myCustomers.size() ; i++){
            if(myCustomers.get(i).getName().equals(customer)){
                return i;
            }
        }
        return -1;
    }
}

// You job is to create a simple banking application.
// There should be a academy.learnprogramming.Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// academy.learnprogramming.
//
//
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