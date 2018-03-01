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

public class IntegerPairs {
	// This class implements the IntegerPair interpreter.

    public static String countPairs(int i1, int i2, int i3, int i4) {
    	// This method checks if there are two pairs and returns the desired string.
    	String pairs = "not two pairs";
    	if (i1==i2 && i3==i4){
    		pairs = "two pairs";
    	}
    	else if (i1 == i3 && i2 == i4){
    		pairs = "two pairs";
    	}
    	else if (i1 == i4 && i2 == i3){
    		pairs = "two pairs";
    	}
    	return pairs;
    }
    
    public static void main(String[] args) {
    	// This method asks for the numbers and calls the countPairs method.
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter four numbers:");
    	String str = in.nextLine();
    	int i1 = Integer.parseInt(str.substring(0,1));
    	int i2 = Integer.parseInt(str.substring(2,3));
    	int i3 = Integer.parseInt(str.substring(4,5));
    	int i4 = Integer.parseInt(str.substring(6,7));
    	System.out.print(countPairs(i1,i2,i3,i4));
    	in.close();
    	
    	
    }

}