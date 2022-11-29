import java.util.Scanner;

public class HW2_Q3 {
	public static void main(String[] args) {
		//This program calculates personal income tax based on the given tax rates reported by The Turkish Revenue Administration.

		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare some values
		double income;
		double taxamount = 0 ;

		//Prompt the user to enter year and income values
		int year = input.nextInt();
		income = input.nextDouble();
		
		//Give error message for invalid inputs
		if (year < 2017 && income == 0) {
			System.out.println("Undefined year value");
		    System.out.println("Income must be > 0");
		    System.exit(1);
		}
		
		//Give error message for invalid inputs
		if ((year < 2017 || year > 2020))  {
			System.out.println("Undefined year value");
			System.exit(1);
		}
		
		//Give error message for invalid inputs
		if (income == 0) {
			System.out.println("Income must be > 0");
		    System.exit(1);
		}
		
		//Calculate income tax for 2020
	    if (year == 2020) {
			if (income <22000) 
				taxamount = income * 0.15;
			else if (income < 49000)
				taxamount = 3300 + (income - 22000)*0.2;
			else if (income < 180000)
				taxamount = 8700 + (income - 49000)*0.27;
			else if (income < 600000)
				taxamount = 44070 + (income - 180000)*0.35;
			else
				taxamount = 191070 + (income - 600000)*0.4;
		}
	    
		//Calculate income tax for 2019
		else if (year == 2019) {
			if (income <18000) 
				taxamount = income * 0.15;
			else if (income < 40000)
				taxamount = 2700 + (income - 18000)*0.2;
			else if (income < 148000)
				taxamount = 7100 + (income - 40000)*0.27;
			else if (income < 500000)
				taxamount = 36260 + (income - 148000)*0.35;
			else 
				taxamount = 159460 + (income - 500000)*0.4;
		}
		
	    //Calculate income tax for 2018
		else if (year == 2018) {
			if (income < 14800) 
				taxamount = income * 0.15;
			else if (income < 34000)
				taxamount = 2220 + (income - 14800)*0.2;
			else if (income < 120000)
				taxamount = 6060 + (income - 34000)*0.27;
			else 
				taxamount = 29280 + (income - 120000)*0.35;
			
		}	
	    //Calculate income tax for 2017
		else if (year == 2017) {
			if (income < 13000) 
				taxamount = income * 0.15;
			else if (income < 30000)
				taxamount = 1950 + (income - 13000)*0.2;
			else if (income < 110000)
				taxamount = 5350 + (income - 30000)*0.27;
			else 
				taxamount = 26950 + (income - 110000)*0.35;
			
		}

	        //Calculate some variables 
		    double incomeaftertax = income - taxamount;
		    double realtaxrate = taxamount * 100 / income; 
		    
		    //Display the results
			System.out.println("Income: " + income);
     		System.out.println("Tax amount: " + (int)(taxamount * 100) /100.0);
	    	System.out.println("Income after tax: " + (int)(incomeaftertax * 100) /100.0);
			System.out.println("Real tax rate: " + (int)(realtaxrate * 100) /100.0 + "%");
	
			// Close the scanner				
			input.close();	
	}
}
