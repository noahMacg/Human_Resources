/*
 * This class implements and expands on the interface PersonList. It has a method to 
 * add people's information to an ArrayList; method to get information from the ArrayList
 * based on the specified index; and a method to print the ArrayList. 
 */

import java.util.ArrayList;

public class PersonSet implements PersonList {

    // Source: CGPT: "arraylist syntax Java"
    protected ArrayList<Person> personSet = new ArrayList<>();

    // Adds a Person to the ArrayList as long as it is not a duplicate
    // as specified in the boolean personSet (Person.java).
    @Override
    public void add(Person p) {
        if (!personSet.contains(p)) {
            personSet.add(p);
        }
    }

    // Source "why will this not get the Person at the input index"
    // Gets the Person from the ArrayList with given index.
    public Person get(int index) {
        if (index >= 1 && index < personSet.size()) {
            return personSet.get(index);
        } else {
            System.out.println("The desired index for the ArrayList is out of bounds");
            return null;
        }
    }

    // Source: Claude: "what is the best way to iterate through an ArrayList of data
    // and concatenate it into a single returnable string"
    @Override
    public String toString() {
        String allData = "";
        for (int i = 0; i < personSet.size(); i++) {
            allData = allData + personSet.get(i) + "\n";
        }
        return allData;
    }
//    public void printWithHeader() {
//        String headerName ="Name";
//        String headerHeight ="Name";
//        String headerName ="Name";
//        System.out.printf();
//
//    }

    // // Source: CGPT "how do I print an ArrayList" and "why does it use override
    // // from another class"
    // // Prints the ArrayList.
    // public void printAll() {
    // // for (Person p : personSet)
    // for (int i = 0; i < personSet.size(); i++) {
    // System.out.println(personSet.get(i)); // Calls toString() automatically
    // // I learned from this that when you pass an object the method of that object
    // // (Person)
    // // it automatically uses the toString Override from that method.
    // }
    // }
}
