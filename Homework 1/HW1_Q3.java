
import java.util.Scanner;
public class HW1_Q3 {

	public static void main(String[] args) {
		//This program asks user to enter some values and calculates the compound monthly interest.
		
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in); 
		
		// Prompt the user to enter an initial principal amount
		System.out.print("Enter initial principal amount: ");
		double principal = input.nextDouble(); 
		
		// Prompt the user to enter annual interest rate
		System.out.print("Enter annual interest rate (e.g. 9.45): ");
		double annualrate = input.nextDouble(); 
		
		// Compute monthly rate using the annual rate
		double mounthlyrate = annualrate / 12;

		// Prompt the user to enter time periods in months
		System.out.print("Enter number of time periods in months: ");
		double timeperiod = input.nextDouble(); 
		
		// Compute final balance amount
		double finalbalance = (principal * (Math.pow(1 + annualrate / 1200 , timeperiod)));

		// Compute total compound interest amount
		double interestamount = (finalbalance - principal);
		
		// Display results
		System.out.println(" ");
		System.out.println("Initial principal amount: " + principal);
		System.out.println("Monthly interest rate: " + (int)(mounthlyrate * 100) / 100.0);
		System.out.println("Total compound interest amount: " + (int)(interestamount * 100) / 100.0);
		System.out.println("Final balance amount: " + (int)(finalbalance * 100) / 100.0);

	// Close the scanner			
	input.close();	
	}

}
