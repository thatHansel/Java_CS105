/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: WaterState
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class WaterState {

	public static String getWaterState(String temp) { // Method to evaluate water state.
		String[] temparray = temp.split("(?<=[a-zA-Z])(?=\\d)|(?<=\\d)(?=[a-zA-Z])"); // Split the string into an array
		String[] possibleStates = {"Water state: GAS", "Water state: LIQUID", "Water state: SOLID"};
		String state = "";
		if (temparray[1].equals("F")){ // Check for metric or standard
			if (Integer.parseInt(temparray[0]) < 32) {
				state = possibleStates[2];
			}
			
			else if (Integer.parseInt(temparray[0]) >= 212) {
				state = possibleStates[0];
			}
			
			else {
				state = possibleStates[1];
			}
		}
		
		else if (temparray[1].equals("C")){ // check temp
			if (Integer.parseInt(temparray[0]) <= 0) {
				state = possibleStates[2];
			}
			
			else if (Integer.parseInt(temparray[0]) >= 100) {
				state = possibleStates[0];
			}
			
			else {
				state = possibleStates[1];
			}
		}
		
		return state;

		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // get input from user
		System.out.print("Enter a Temperature: ");
		String temp = in.nextLine();
		
		System.out.println(getWaterState(temp)); // call the method
		in.close();
		

	}

}
