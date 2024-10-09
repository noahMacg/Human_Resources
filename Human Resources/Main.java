
/**
 * Noah MacGillivray
 * Assignment: Human Resources Part 1
 * 10/6/2024
 * CSCI 2251 U01
 * Purpose: This program reads in a file of human 
 * resources data; instantiates various test Persons;
 * tests / adds them to the ArrayList in PersonSet.java;
 * reads in a file of HR data and prints them; and
 * implements / test file output. 
 */
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
// Composition 
Q2: Color and Red are related
by which, Inheritance or Composition?
// Inheritance 
Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
// Inheritance 
Q4: Furniture and Desk are related
by which, Inheritance or Composition?
// Inheritance 	
Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
// Composition
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 * if (args.length != 1) {
		 * System.out.println("Please provide the file path.");
		 * return;
		 * }
		 * String filePath = args[0];
		 */

		String filePath = "C:\\Users\\pilga\\code\\CS2251_code\\Human_Resources\\Human Resources\\hr.txt";

		// Testing
		/*
		 * Person noah = new Person("Noah", 172, 72);
		 * Person mario = new Person("Mario", 155, 90);
		 * Person noahDup = new Person("Noah", 172, 72); // Dup test
		 * Person peach = new Person("Peach", 183, 60);
		 * 
		 * PersonOrderedSet personSet = new PersonOrderedSet();
		 * personSet.add(noah);
		 * personSet.add(mario);
		 * personSet.add(peach);
		 * personSet.add(noahDup);
		 * System.out.println(personSet.allPersonData());
		 * System.out.println();
		 */

		PersonSet personOrderedSet = new PersonSet();
		PersonSet personImperialSet = new PersonSet();

		String name; // Holds name while reading in
		double height; // Holds height while reading in
		double weight; // Holds height while reading in

		// Reads in file
		try {
			Scanner fileReader = new Scanner(new File(filePath));
			if (fileReader.hasNextLine()) {
				fileReader.nextLine();
			}
			while (fileReader.hasNextLine()) {
				name = fileReader.next();
				height = fileReader.nextDouble();
				weight = fileReader.nextDouble();

				Person orderPerson = new Person(name, height, weight);
				personOrderedSet.add(orderPerson);
				Person imperialPerson = new Person(name, height, weight);
				personImperialSet.add(imperialPerson);

			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
		System.out.println(personOrderedSet.allPersonData());
		System.out.println(personImperialSet.allPersonData());

		// File writer
		try {
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
	}
}
