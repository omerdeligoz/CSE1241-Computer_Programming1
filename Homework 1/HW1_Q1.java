import java.util.Scanner;

public class HW1_Q1 {
	
	public static void main(String[] args) {
		//This program calculates and displays cost of a trip
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the driving distance
		System.out.print("Enter the driving distance:");					
		double distance = input.nextDouble();				
		
		// Prompt the user to enter the fuel efficiency of the car in miles per gallon
		System.out.print("Enter miles per gallon:");
		double milespergallon = input.nextDouble();			
		
		// Prompt the user to enter the price per gallon
		System.out.print("Enter price per gallon:");
		double pricepergallon = input.nextDouble();			
		
		// Compute cost of the driving
		double costofdriving = (distance / milespergallon * pricepergallon);  

		// Display the result
		System.out.println("The cost of driving is:" + "$" + (int)(costofdriving * 100) / 100.0);  

		// Close the scanner				
		input.close();
	}

}
