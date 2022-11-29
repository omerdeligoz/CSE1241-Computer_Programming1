import java.util.Scanner;

public class HW4_Q3 {
	/*This program takes an input letter and outputs it in a diamond shape. 
	  Given a letter, it prints a diamond starting with 'A', with the supplied letter at the widest point.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Create a scanner object

		System.out.print("Enter a Letter: ");   //Prompt the user to enter a letter
		String inputvalue = input.next();

		inputvalue = inputvalue.toUpperCase();  //replace lowercase letter in input with uppercase

		//Declare some variables
		char letter = inputvalue.charAt(0) ;
		int n = (letter-('A'-1));

		//If the input is incorrect form, show an error message to user
		if(inputvalue.length()!=1 || Character.isLetter(letter) != true) {
			System.out.println("Invalid Input !");
			System.exit(1);
		}

		//Create a two dimensional array
		char[][] diamond = new char[2*n-1][2*n-1] ;
		diamond = constructDiamond (letter);  //Call the construction method
		printDiamond (diamond);		//Call the print method

		input.close();
	}


	public static char[][] constructDiamond (char letter){
		int n = (letter-('A'-1)); 

		//Create a two dimensional array
		char[][] diamond = new char[2*n-1][2*n-1];

		//Declare diamond array 
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {				
				if(row + col == n-1) 
					diamond[row][col]= (char)('A' + row);  
				else 
					diamond[row][col]= '.';
			}
			for (int col = n; col < 2*n-1; col++) {
				if(col - row == n-1) 
					diamond[row][col]= (char)('A' + row);		 
				else 
					diamond[row][col]= '.';	 	
			}
		}
		for (int row = n; row < 2*n-1; row++) {
			for (int col = 0; col < n; col++) {				
				if(row - col == n-1) 
					diamond[row][col]= (char)(letter + (n-1-row));
				else 
					diamond[row][col]= '.';
			}
			for (int col = n; col < 2*n-1; col++) {
				if((col - n+1) + (row - n+1) == n-1) 
					diamond[row][col]= (char)(letter + (n-1-row));		 
				else 
					diamond[row][col]= '.';	 	
			}
		}
		return diamond;
	}

	public static void printDiamond (char[][] diamond) {
		//Print the diamond array
		for (int row = 0; row < diamond.length; row++) {
			for (int column = 0; column < diamond[row].length; column++) {
				System.out.print(diamond[row][column]);
			}
			System.out.println();
		}
	}
}
