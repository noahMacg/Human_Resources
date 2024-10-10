
// Source: CGPT "can you override a constructor in a child class to
// adjust the weight and height of the person to imperial
public class PersonImperialSet extends PersonSet {
    @Override
    public void add(Person p) {
        // Convert height from cm to ft
        double heightInFeet = p.getHeight() * 0.0328084;
        System.out.println("In PersonImperialSet");
        // Convert weight from kg to lbs
        double weightInPounds = p.getWeight() * 2.20462;
        // System.out.println(weightInPounds);

        // Set the person's height and weight to imperial units
        p.setHeight(heightInFeet);
        p.setWeight(weightInPounds);

        // Calls the parent class addPerson() to add to the list
        super.add(p);

    }
}
