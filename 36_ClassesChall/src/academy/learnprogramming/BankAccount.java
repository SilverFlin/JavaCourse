package academy.learnprogramming;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public BankAccount(){
        this.accountNumber = 12345;
        this.balance = 0;
        this.customerName = "Default Name";
        this.email = "Default Email";
        this.phoneNumber = 0;
    }
    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
       this(12345, 0, customerName, email, phoneNumber);
    }

    public void depositFunds(int qty){
        this.balance += qty;
        System.out.println("Successfully added +$" + qty);
        System.out.println("Current balance is: " + this.balance);
    }
    public void withdrawFunds(int qty){
        if (qty <= this.balance){
            this.balance -= qty;
            System.out.println("Successfully transaction: -$" + qty);
            System.out.println("Current balance is: " + this.balance);
        } else{
            System.out.println("Insufficient funds");
        }

    }

        // setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("Current Account Number is: " + this.accountNumber);
    }
    public void setBalance(int balance){
        this.balance = balance;
        System.out.println("Current Balance is: " + this.balance);
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
        System.out.println("Name has set as " + this.customerName);
    }
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
            System.out.println("Email applied: " + this.email);
        } else{
            System.out.println("Invalid Email");
        }

    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        System.out.println("Now your phone number is: " + this.phoneNumber);
    }

    //getters
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }




}


// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.