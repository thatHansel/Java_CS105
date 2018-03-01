/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: AtmPin
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class DocStats {
		// Gets filename from user, finds the file, and converts to string.
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Filename: ");
		String fileName = in.nextLine();
		String fileString = readFile(fileName);

		// Calls methods to get document statistics
		System.out.println("Number of characters: " + getNumberCharacters(fileString));
		System.out.println("Number of words: " + getNumberWords(fileString));
		System.out.println("Number of lines: " + getNumberLines(fileString));

		in.close();
	}
	public static int getNumberCharacters(String fileString) {
		return fileString.length();
	}
	public static int getNumberWords(String fileString) {
		return fileString.split("\\s+").length;
	}
	public static int getNumberLines(String fileString) {
		return fileString.split("\\n+").length;
	}
	public static String readFile(String fileName) throws IOException { // Converts file to string.
		FileInputStream docFile = new FileInputStream(fileName);
		
		byte doc[] = new byte[docFile.available()];
		docFile.read(doc);
		
		docFile.close();
		
		return new String(doc);
	}
}
