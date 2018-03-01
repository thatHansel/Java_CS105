/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: MontyHallParadox
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Random;

public class MontyHallParadox {

	public static void main(String[] args) {
		
		// main checks the simulator
		
		System.out.println(simulateMontyHallParadox(1000,12345));
		
	}


	public static int simulateMontyHallParadox(int experiments, int seed) {
		
		// Initialize the generator.
		
		Random generator = new Random(seed);

		int wins = 1;
		
		
		for(int i = 0; i < experiments; i++) {
			
			// Run for the desired number of iterations.
			
			// Find the probability by comparing the choice to the door. 
			
			if( generator.nextInt(3) == generator.nextInt(3)) {
				wins++;
				
			}
		}
		
		// Inverse the probability to return the desired result.
		
		return experiments - wins + 1;

}
}