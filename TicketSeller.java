/**
 * CS 105 Theory & Practice I
 * CRN: [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 * Assignment: TicketSeller
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [uoᴉʇɐɯɹoɟuᴉ ɹnoʎ oʇ sᴉɥʇ ǝƃuɐɥɔ]
 */

package edu.sbcc.cs105;

import java.util.Scanner;

public class TicketSeller {

	public static void main(String[] args) {
		
		// Main method to test processOrder.
		
		System.out.print("Input the number of tickets you want to sell: ");
		Scanner in = new Scanner(System.in);
		// I get a runtime error when I use in.close(). ???
		
		int numberTickets = in.nextInt();
		
		int buyers = 0;
		while ( numberTickets > 0 ) {
			
			// Loop to interact with user.
			
			System.out.print("Input requested tickets: ");
			Scanner in1 = new Scanner(System.in);
			int order = in1.nextInt();
			int sell = processOrder(order, numberTickets);
			if ( sell < numberTickets) {
				numberTickets = sell;
				buyers ++ ;
				
			System.out.println("Thank you for your purchase. There are " + numberTickets + " tickets remaining." );
			
			}
			
			else {
				System.out.println("Too many tickets requested, please try again.");
			}
		}
		
		
		System.out.print("You had " + buyers + " buyers.");
		
		
	}
	
	public static int processOrder(int order, int numberTickets) {
		
		// Determines if the order is valid and returns the remaining tickets.
		
		int newNumberTickets = numberTickets;
		
		if (order <= 4 && order <= numberTickets ){
			
			newNumberTickets = numberTickets - order;
			
		}
		
		return newNumberTickets;
	}
}