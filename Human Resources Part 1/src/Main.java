
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
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		PersonSet personSet = new PersonSet();
		// System.out.println(personSet.toString());
		Person noah = new Person("Noah", 172, 72);
		Person mario = new Person("Mario", 155, 90);
		Person noahDup = new Person("Noah", 172, 72);
		// System.out.println(noah);
		personSet.add(noah);
		personSet.add(mario);
		personSet.add(noahDup);
		personSet.printAll();

		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		// Scanner fileReader = null;

		String name;
		int height;
		int weight;

		String filePath = "C:\\Users\\pilga\\code\\CS2251_code\\Human_Resources_Part1\\Human Resources Part 1\\src\\hr.txt";

		try {
			Scanner fileReader = new Scanner(new File(filePath));
			if (fileReader.hasNextLine()) {
				fileReader.nextLine();
			}
			while (fileReader.hasNextLine()) {
				name = fileReader.next();
				height = fileReader.nextInt();
				weight = fileReader.nextInt();
				System.out.printf("%-10s %-10d %-10d", name, height, weight);
				System.out.println();
			}
			fileReader.close();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Input did not match\n");
			e.printStackTrace();
			System.out.println("\n" + e + "\n");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filePath);
			e.printStackTrace();
		}

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
