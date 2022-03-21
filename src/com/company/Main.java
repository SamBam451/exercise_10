//Samuel Bovshovets

package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Contacts contacts1 = new Contacts();
        System.out.println(contacts1);

        for(Contact a: contacts1){
        System.out.println(a);
        }
    }
}
//Create a class to store contact information consisting of a name and email address. Additionally, create a class to
// store a collection of contacts that implements the Iterable interface so that a for-each loop can be used with the
// collection class. Demonstrate this functionality with a for-each loop in the Main.main() method that displays contact information.
class Contact{
    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class Contacts implements Iterable<Contact>{
    private ArrayList<Contact> listOfContacts = new ArrayList<>();
    public Contacts(){
        listOfContacts.add(new Contact("Joe", "123abc@gmail.com"));
        listOfContacts.add(new Contact("Bill", "abc321@gmail.com"));
        listOfContacts.add(new Contact("Bob", "e@gmail.com"));
    }
    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }
}