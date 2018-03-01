/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: GaussianEaster
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class IntegerSign {
	// This class implements the IntegerSign classifier.

    public static String IntegerSign(int integer) {
    	// This method determines the sign and returns a string.
    	String sign;
    	if (integer>0){
    		sign = "positive";
    	}
    	else if (integer<0){
    		sign = "negative";
    	}
    	else {
    		sign = "zero";
    	}
    	return sign;

    }
    
    public static void main(String[] args) {
    	// This method asks the user for an input and then calls the deterimineSign method and prints the sign.
		Scanner in = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	int n = in.nextInt();
    	System.out.print(determineSign(n));
    	in.close();
    }
}