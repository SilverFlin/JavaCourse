package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount silver = new BankAccount("Silver", "myEmail@silve.com", 987564);
        getInfoBankAccount(silver);
        System.out.println();
        VipCustomer silverVIP = new VipCustomer("Silver", 10000.0, "myEmail@silver.com");
        getInfoVipCustomer(silverVIP);



//        silverAccount.depositFunds(500);
//        silverAccount.depositFunds(1000);
//        silverAccount.withdrawFunds(500);

    }
    public static void getInfoBankAccount(BankAccount name){
        System.out.println("Name: " + name.getCustomerName());
        System.out.println("Account Number: " + name.getAccountNumber());
        System.out.println("Current Balance: " + name.getBalance());
        System.out.println("Email: " + name.getEmail());
        System.out.println("Phone Number: " + name.getPhoneNumber());
    }
    public static void getInfoVipCustomer(VipCustomer name){
        System.out.println("Name: " + name.getName());
        System.out.println("Credit Limit: " + name.getCreditLimit());
        System.out.println("Email Adress: " + name.getEmail());
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

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1.  To allow the customer to deposit funds (this should increment the balance field).
// 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

//        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
//              //  "(087) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@email.com","12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.