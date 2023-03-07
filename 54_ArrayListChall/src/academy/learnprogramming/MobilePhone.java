package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    ArrayList<Contacts> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contacts>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public void startDevice(){
        boolean isLogin = true;
        int option = 0;
        Scanner sc = new Scanner(System.in);
        while(isLogin){

            switch (option){
                case 0:
                    System.out.println(" 0 -> Instructions");
                    System.out.println(" 1 -> Quit");
                    System.out.println(" 2 -> Print List of Contacts");
                    System.out.println(" 3 -> Add New Contact");
                    System.out.println(" 4 -> Update Contact");
                    System.out.println(" 5 -> Remove Contact");
                    System.out.println(" 6 -> Find Contact");
                    break;
                case 1:
                    System.out.println("Bye");
                    isLogin = false;
                    break;
                case 2:
                    showContactList();
                    break;
                case 3:
                    System.out.print("Name: ");
                    String name = sc.next();
//                    sc.close();
                    System.out.print("Phone Number: ");
                    String phoneNumber = sc.next();
//                    sc.close();
                    Contacts contact = new Contacts(name, phoneNumber);
                    if (!compareNames(contact.getName())){
                        contacts.add(contact);
                    }else{
                        System.out.println("Try Again");
                    }
                    break;
                case 4:
                    showContactList();
                    System.out.println("Introduce the index to update");
                    int indexUpdate = Integer.parseInt(sc.next()) - 1;
                    try{
                        System.out.println("Introduce New Name of " + contacts.get(indexUpdate).getName() + " | Or press 'q' to quit");
                        String updateName = sc.next();
                        if (updateName.equals("q")) break;
                        contacts.get(indexUpdate).setName(updateName);
                        System.out.println("Introduce New Phone Number, past number: " + contacts.get(indexUpdate).getPhoneNumber() + " | Or press 'q' to quit");
                        String updatePhone = sc.next();
                        if (updatePhone.equals("q")) break;
                        contacts.get(indexUpdate).setPhoneNumber(updatePhone);
                    }catch(Exception e){
                        System.out.println("invalid index");
                    }
                    break;
                case 5:
                    showContactList();
                    System.out.println("Insert index to delete");
                    int indexDelete = Integer.parseInt(sc.next()) - 1;
                    try{
                        boolean isSure = true;
                        while (isSure){
                            System.out.println("Are you sure? Y/n");
                            String rusure = sc.next();
                            if (rusure.equals("Y") ||rusure.equals("y")){
                                System.out.println("Contact " + contacts.get(indexDelete).getName()+" Deleted");
                                contacts.remove(indexDelete);
                                isSure = false;
                            }else if(rusure.equals("N") || rusure.equals("n")){
                                System.out.println("Action Cancelled");
                                break;
                            }
                        }

                    }catch (Exception e){
                        System.out.println("invalid index");
                    }
                    break;
                case 6:
                    System.out.println("Insert Name to Search for");
                    String nameSearch = sc.next();
                    if(!compareNames(nameSearch)){
                        System.out.println("Contact not found");
                    }




            }

            System.out.println("");
            if (isLogin){
                System.out.println("______________");
                System.out.print("Insert Option -> ");
                option = sc.nextInt();
            }



        }

    }
    
    private boolean compareNames(String name){

        boolean isEqual = false;
        for (int i = 0; i < contacts.size(); i++) {
            isEqual = contacts.get(i).getName().equals(name);
            if (isEqual) {
                System.out.println("Contact founded on index: " + (i+1));
                break;
            }
        }
        return isEqual;
    }
    private void showContactList(){
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i+1 + ". -> " + contacts.get(i).getName() + ": " + contacts.get(i).getPhoneNumber());
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

/*
public class MobilePhone {

    private String myNumber;
    private java.util.ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new java.util.ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        return findContact(contact) >= 0;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        return findContact(oldContact) >= 0;
    }

    public boolean removeContact(Contact contact){
        return findContact(contact) < 0;
    }

    private int findContact(Contact contact){
        int contactPosition = -1;
        for(int i = 0 ; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact.getName())){
                return i;
            }
        }
        return contactPosition;
    }
    private int findContact(String name){
         int contactPosition = -1;
        for(int i = 0 ; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return contactPosition;
    }
    public Contact queryContact(String name){
        if(findContact(name) >= 0 ){
            return myContacts.get(findContact(name));
        }else{
            return null;
        }
    }
    public void printContacts(){
        for(int i = 0 ; i<myContacts.size(); i++){
           System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber() );
        }

    }

}
 */

/*
public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
 */