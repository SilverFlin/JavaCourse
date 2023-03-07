package academy.learnprogramming;


import java.util.Scanner;

public class MobilePhone {
    private Contacts contacts = new Contacts();


    public void login(){
        Scanner sc = new Scanner(System.in);
        boolean isLogin = true;
        int option = 0;
        while (isLogin){
            switch (option) {
                case 0:
                    System.out.println("Instructions");
                    System.out.println("Press:");
                    System.out.println("0 - Instructions");
                    System.out.println("1 - Print List of Contacts");
                    System.out.println("2 - Add new Contact");
                    System.out.println("3 - Remove Contact");
                    System.out.println("4 - Update Contact");
                    System.out.println("5 - Find Contact");
                    System.out.println("6 - quit");
                    break;
                case 1:
                    contacts.queryContactNames();
                    break;
                case 2:
                    System.out.println("New Contact Name");

                    String name = sc.nextLine();
                    contacts.store(name);

                    sc.next();

                    break;
                case 3:
                    System.out.println("Contact to remove");
                    String contact = sc.nextLine();
                    contacts.remove(contact);
                    break;
                case 4:
                    System.out.println("Updating Contact");
                    System.out.print("Name: ");
                    String Name = sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    contacts.modify(Name,newName);
                    break;
                case 5:
                    System.out.println("Find Contact");
                    System.out.println("->");
                    String find = sc.nextLine();
                    contacts.findIndex(find);
                    break;
                case 6:
                    System.out.println("Bye");
                    isLogin = false;
                    break;




            }
            if (isLogin){
                System.out.print("Choose an option: ");
                option = sc.nextInt();

            }

            System.out.println("");
        }
    }


}
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.


// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.