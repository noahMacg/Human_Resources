
/**
 * Noah MacGillivray
 * Assignment: Human Resources Part 1
 * 10/5/2024
 * CSCI 2251 U01
 * Purpose: 
 */
/*
This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?

Q2: Color and Red are related
by which, Inheritance or Composition?

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?

Q4: Furniture and Desk are related
by which, Inheritance or Composition?

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PersonSet personSet = new PersonSet();
		// System.out.println(personSet.toString());
		Person noah = new Person("Noah", 172, 72);
		Person noahDup = new Person("Noah", 172, 72);
		// System.out.println(noah);
		personSet.add(noah);
		personSet.add(noahDup);
		personSet.printAll();

		/*
		 * // Don't overcomplicate the data
		 * // reading. After skipping the
		 * // first row, you can use the
		 * // following to read a row of
		 * // character info, assuming your
		 * // Scanner is named "fileReader"
		 * String name = fileReader.next();
		 * double height = fileReader.nextDouble();
		 * double weight = fileReader.nextDouble();
		 */

		/*
		 * try
		 * {
		 * FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
		 * fileWriterOrder.write("testing");
		 * fileWriterOrder.close();
		 * }
		 * catch(IOException e)
		 * {
		 * e.printStackTrace();
		 * System.out.println(e);
		 * System.exit(1);
		 * }
		 */
	}
}
