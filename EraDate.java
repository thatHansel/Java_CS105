/**
 * CS 105 Theory & Practice
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: EraDate
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EraDate {
	
	public static String getEra(int day, int month, int year) {
		
		// Put the era dates in the GregorianCalendar class.
		
		Calendar givenDate = new GregorianCalendar(year, month, day);
		Calendar meiji = new GregorianCalendar(1912, 7, 30);
		Calendar taisho = new GregorianCalendar(1926, 12, 25);
		Calendar showa = new GregorianCalendar(1989, 1, 7);
		
		// If the date is after all previous eras, default current era.
		
		String era = "Heisei";
		
		// If the date is before all eras, use "Meiji".
		
		if (givenDate.compareTo(meiji) < 1) {
			era = "Meiji";
	}

		else if (givenDate.compareTo(taisho) < 1) {
			era = "Taisho";
	}

		else if (givenDate.compareTo(showa) < 1) {
			era = "Showa";
	}


		return era;
		
	}
}