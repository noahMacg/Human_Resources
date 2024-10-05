import java.util.ArrayList;

public class PersonSet implements PersonList {

    // Source: CGPT: "arraylist syntax Java"
    private ArrayList<Person> personSet = new ArrayList<>();

    @Override
    public void add(Person p) {
        if (!personSet.contains(p)) {

            personSet.add(p);
        }

    }

    // Source "why will this not get the Person at the input index"
    // public Person get (int index) {
    // return personSet<index>;}
    public Person get(int index) {
        if (index >= 1 && index < personSet.size()) {
            return personSet.get(index);
        } else {
            System.out.println("The desired index for the ArrayList is out of bounds");
            return null;
        }
    }

    // Source: CGPT "how do I print an ArrayList"
    public void printAll() {
        // for (Person p : personSet)
        for (int i = 0; i < personSet.size(); i++) {
            System.out.println(personSet.get(i)); // Calls toString() automatically
            // I learned from this that when you pass an object the method of that object
            // (Person)
            // it automatically uses the toString Override from that method.
        }
    }

}
