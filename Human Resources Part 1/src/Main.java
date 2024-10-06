
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

		PersonSet personSet = new PersonSet();
		Person noah = new Person("Noah", 172, 72);
		Person mario = new Person("Mario", 155, 90);
		Person noahDup = new Person("Noah", 172, 72); // Dup test
		Person peach = new Person("Peach", 183, 60);

		personSet.add(noah);
		personSet.add(mario);
		personSet.add(peach);
		personSet.add(noahDup);
		personSet.printAll();
		System.out.println();

		String name; // Holds name while reading in
		int height; // Holds height while reading in
		int weight; // Holds height while reading in

		String filePath = "C:\\Users\\pilga\\code\\CS2251_code\\Human_Resources_Part1\\Human Resources Part 1\\src\\hr.txt";
		// Reads in file
		try {
			Scanner fileReader = new Scanner(new File(filePath));
			if (fileReader.hasNextLine()) {
				fileReader.nextLine();
			}
			while (fileReader.hasNextLine()) {
				name = fileReader.next();
				height = fileReader.nextInt();
				weight = fileReader.nextInt();
				System.out.printf("%-10s %-10d %-10d", name, height, weight); // Prints the info while reading in.
				System.out.println();
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}
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
