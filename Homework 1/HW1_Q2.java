

import java.util.Scanner;

public class HW1_Q2 {

	public static void main(String[] args) {
		/* This program converts a date that is given in days to
		   �Year: <years>, Month: <months>, Day: <days>� format.  */

		// Create a Scanner object	
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter number of days
		System.out.print("Enter Number of days:");
		int numberofdays = input.nextInt();
		
		// Declare some necessary variables
		int Year;
		int Month;
		int Day;
		int remainingday;
		
		// Compute Year, Month, and Day variables
		Year = numberofdays / 365;
		remainingday = numberofdays % 365;
		Month = remainingday / 31;
		remainingday = remainingday % 31;
		Day = remainingday;
		
		// Display the days to year, month and day format
		System.out.println("Year: " + Year + " ," + " Month: " + Month + " , " + " Day: " + Day + ".");
	
	// Close the scanner	
	input.close();	
	}
}