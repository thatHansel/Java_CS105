/**
 * CS 105 Theory & Practice
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: AlignedNumbers
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */
package edu.sbcc.cs105;

import java.util.*;

/**
 * This class tests the AlignedNumbers object.
 *
 */
public class AlignedNumbers {
    /**
     * This code accepts two integers and then prints out the relationship 
     * between those two numbers as described in the problem statement.
     *
     * @param first The first integer value
     * @param second The second integer value
     *
     * @return A string with the metrics formatted as described
     */
    public static String alignNumbers(int first, int second) {
        int sum = first + second;
        float average = ((float)first+(float)second)/2;
        int difference = first-second;
        int distance = Math.abs(second-first);
        int product = first*second;
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s%15d\n","Sum:",sum));
        sb.append(String.format("%-29s%3.2f\n","Average:",average));
        sb.append(String.format("%-15s%15d\n","Difference:",difference));
        sb.append(String.format("%-15s%15d\n","Distance:",distance));
        sb.append(String.format("%-15s%15d\n","Product:",product));
        sb.append(String.format("%-15s%15d\n","Max:",max));
        sb.append(String.format("%-15s%15d\n","Min:",min));
        //String aligned = String.format("%-15s%15d%-29s%3.2f%-15s%16d%-15s%16d%-15s%16d%-15s%16d%-15s%16d%s", "Sum:",sum,"\nAverage:", average,"\nDifference:", difference, "\nProduct:", product, "\nDistance:", distance, "\nMaximum:", max, "\nMinimum:", min,"\n");

        return sb.toString();//aligned;
    }
    
    /**
     * This code runs by asking for two numbers, computing the various stats,
     * and then printing it out.
     * 
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();

        System.out.println(alignNumbers(first, second));
    }
}