/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: Grade
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class Grade {
    public static float computeGradePoint(String letterGrade) {
    	
    	
    	// Initialize the numGrade variable
    	
    	float numGrade = 0.0f;
    	letterGrade = letterGrade.toUpperCase();
    	
    	// Check the grade and + - modifier
        // don't include + for A
    	if (letterGrade.charAt(0) == 'A') {
    		numGrade = 4.0f;
    		if(letterGrade.length() == 2) {
        		if (letterGrade.charAt(1) == '-'){
        			numGrade = numGrade - 0.3f;
        		}
        	}
    	} else if (letterGrade.charAt(0) == 'B') {
    		numGrade = 3.0f;
    		if(letterGrade.length() == 2) {
        		if (letterGrade.charAt(1) == '-'){
        			numGrade = numGrade - 0.3f;
        		} else if (letterGrade.charAt(1) == '+') {
        			numGrade = numGrade + 0.3f;
        		}
        	}
    	} else if (letterGrade.charAt(0) == 'C') {
    		numGrade = 2.0f;
    		if(letterGrade.length() == 2) {
        		if (letterGrade.charAt(1) == '-'){
        			numGrade = numGrade - 0.3f;
        		} else if (letterGrade.charAt(1) == '+') {
        			numGrade = numGrade + 0.3f;
        		}
        	}
    	} else if (letterGrade.charAt(0) == 'D') {
    		numGrade = 1.0f;
    		if(letterGrade.length() == 2) {
        		if (letterGrade.charAt(1) == '-'){
        			numGrade = numGrade - 0.3f;
        		} else if (letterGrade.charAt(1) == '+') {
        			numGrade = numGrade + 0.3f;
        		}
        	}
    		// don't include F in the + -
        }  else if (letterGrade.charAt(0) == 'F') {
        	numGrade = 0.0f;
        }
    	
    	return numGrade;
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a letter letterGrade: ");
    	String letterGrade = in.nextLine();
    	in.close();
    	System.out.print(computeGradePoint(letterGrade));
        // Put code to read a letter letterGrade from the user
    }

}