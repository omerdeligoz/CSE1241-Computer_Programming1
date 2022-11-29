import java.util.Scanner;

public class HW2_Q1 {
	public static void main(String[] args) {
		//This program prompts the user to enter the first 9 digits and displays the 10-digit ISBN
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the first 9 digits of an ISBN
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int fullnumber = input.nextInt();
		
		
		//Convert the integer value to a string 
		String stringnumber = fullnumber + "";
		
		//Declare some necessary variables
		String zeros = "000000000";
		int remainingnumber;

		//Find and declare all digits 
		int ninth = fullnumber % 10;
		remainingnumber = fullnumber / 10;
		int eighth = remainingnumber % 10;
		remainingnumber = remainingnumber / 10;
		int seventh = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int sixth = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int fifth = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int fourth = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int third = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int second = remainingnumber % 10; 
		remainingnumber = remainingnumber / 10;
		int first = remainingnumber; 
		
		//Compute the last digit
		int lastdigit = (first + 2*second + 3*third + 4*fourth + 5*fifth + 6*sixth + 7*seventh + 8*eighth + 9*ninth) % 11;
		
		//Find and declare number of leading zeros
		String leadingzeros = zeros.substring(stringnumber.length());
	

		//Display the result
		if (lastdigit == 10) {
			String xdigit = "X";
      		System.out.println("The ISBN-10 number is " + leadingzeros + fullnumber + xdigit);
			}
		
		else
       		System.out.println("The ISBN-10 number is " + leadingzeros + fullnumber + lastdigit);

	// Close the scanner				
    input.close();
	}
}

