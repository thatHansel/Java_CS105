/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class LetterSize {

    /**
     * Write source code to calculate the size of an 8.5 x 11 inch letter in millimeters.
     */
    public static String computeLetterSize() {
    	double pageHeightInches = 11.0;
    	double pageWidthInches = 8.5;
    	// 25.4 mm in an inch
    	double pageHeightMM = pageHeightInches*25.4;
    	double pageWidthMM = pageWidthInches*25.4;
    	String area = String.format("The dimensions of the thing are %6.2f",pageWidthMM) + " by " + String.format("%.2f",pageHeightMM);
    	return area; //return the desired result
    }
    
    public static void main(String[] args) {
        System.out.println(computeLetterSize());
    }
}