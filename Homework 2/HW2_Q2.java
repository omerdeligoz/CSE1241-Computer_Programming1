import java.util.Scanner;

public class HW2_Q2 {
	public static void main(String[] args) {
		//This program calculates and displays the day of the week according to users input

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a year 
		System.out.print("Enter year (e.g. 2012): ");
		int year = input.nextInt();
		
		//Prompt the user to enter a month
		System.out.print("Enter month (e.g. 1-12): ");
		int month = input.nextInt();                      
		
		//Change the 1 and 2 values according to formula
		  if (month == 1) {
		  	  year -= 1; 
			  month = 13;
		  }
		  if (month == 2) {
			  year -= 1;
			  month = 14;
		  }
		
		//Prompt the user to enter the day of the month
		System.out.print("Enter the day of the month (e.g. 1-31): ");
		int dayofthemonth = input.nextInt();             
		
		//Calculate century and year of the century values 
		int century = year / 100;                        
		int yearofthecentury = year % 100;               
		
		//Calculates the result
		int dayoftheweek = (dayofthemonth + 26*(month+1)/10 + yearofthecentury + yearofthecentury/4 + century/4 + 5*century) % 7;
		
		//Display the result according to day
		switch (dayoftheweek) {
		  case 0: System.out.println("Day of the week is Saturday" ); break;
		  case 1: System.out.println("Day of the week is Sunday" ); break;
	      case 2: System.out.println("Day of the week is Monday" ); break;
          case 3: System.out.println("Day of the week is Tuesday" ); break;
		  case 4: System.out.println("Day of the week is Wednesday" ); break;
		  case 5: System.out.println("Day of the week is Thursday" ); break;
		  case 6: System.out.println("Day of the week is Friday" ); 
		}
		
	// Close the scanner				
	input.close();	

	}

}
