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

import java.util.*;

/**
 * This class implements the GaussianEaster algorithm.
 *
 */
public class GaussianEaster {

    /**
     * Compute the date of easter using the Gaussian formula.
     * 
     * @param year The year for which to compute the date
     * @return A formated string with the month and day of easter.
     */
    public static String computeDate(int year) {
    	
        // Gauss' Easter Algorithm
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;
        
        // Returns the formatted date. 
        String date = String.format("Month: %s Day: %s", n, p);

        return date;
    }
     
    /**
     * Test this code by asking for a year and then having the code compute the value.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Why is 'in' never closed and how do I close it?
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        in.close();
        
        System.out.println(computeDate(year));
    }
}