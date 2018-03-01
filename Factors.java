/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: Factors
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */


package edu.sbcc.cs105;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		// Get the number from the user.
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to factor: ");
		int number = in.nextInt();		
		in.close();
		
		System.out.println(findFactors(number));
		
	}
	
	public static String findFactors(int number) {
		
		String factors = "";
		
		
		// Create a new variable to modify, preserving the input.
		
		int tempNumber = number;
		
			
		for( int i = 2; i < number/2; i++ ) {
			
			// Iterate through the possible factors, add each factor to the returned string, and divide by the factor.
								
			int tryi = tempNumber/i;
				
			if ( tryi*i == tempNumber) {
				
				factors = factors + String.valueOf(i) + " ";
				
				i = 1;
				
				tempNumber = tryi;
			}
				
		}
			
		return factors;
		
	}

}
