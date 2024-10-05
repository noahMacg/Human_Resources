public class Person {
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Source: CGPT: "how would I construct an override toString in java to output a
    // database ready
    // string format
    @Override
    public String toString() {
        return String.format("\"%s\",\"%d\",\"%s\"", name, height, weight);
    }

    // Equals method outline
    @Override
    public boolean equals(Object o) {
        // if Object o is null then return false
        if (o == null)
            return false;

        // if Object o == this then return true
        if (o == this) {
            System.out.println("This " + o + " is a duplicate.");
            return true;
        }

        // if Object o is not an instance of Person then return false
        if (!(o instanceof Person)) {
            System.out.println("This " + o + " is a duplicate.");
            return false;
        }

        // Declare a new variable of type Person (perhaps named p)
        // and assign it to Object o cast as type Person
        Person p = (Person) o;
        // if Person p has the same name, height, and weight as
        // this then return true
        if (name.equals(p.name) && height == p.height && weight == p.weight) {
            System.out.println("This " + o + " is a duplicate.");
            return true;
        }

        else
            return false;

        // else return false

    }

}
