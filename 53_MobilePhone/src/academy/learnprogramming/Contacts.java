package academy.learnprogramming;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contacts = new ArrayList<String>();

    public void store(String contactName){
        contacts.add(contactName);
    }
    public void remove(String contactName){
        int indexName = findIndex(contactName);
        System.out.println("Removing: " + contacts.get(indexName));
        contacts.remove(indexName);
    }
    public void remove(int numContact){
        contacts.remove(numContact);
    }
    public void modify(String name, String newName){
        contacts.add(findIndex(name),newName);
    }
    public int findIndex(String contactName){
        return contacts.indexOf(contactName);
    }
    public void queryContactNames(){
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ". -> " + contacts.get(i));
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