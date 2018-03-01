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

public class AtmPin {

	public enum PinValidationResult { 
	    UNLOCKED_PIN_CORRECT,
	    UNLOCKED_PIN_INCORRECT,
	    LOCKED
	}
	
	public static void main(String[] args) {
		
		System.out.println(validatePin("1234",1));
		// Test the pin validator.
	}
	
	public static PinValidationResult validatePin(String pin, int incorrectCount) {
		
		// Run test cases.
		
		if(pin.equals("1234")) {
			return PinValidationResult.UNLOCKED_PIN_CORRECT;
			}
		
		else if (incorrectCount >= 2) {
			return PinValidationResult.LOCKED;
		}
		
		else {
			return PinValidationResult.UNLOCKED_PIN_INCORRECT;
		}
		
		// Return the enumerated result.
	}

}
