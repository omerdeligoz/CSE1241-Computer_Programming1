import java.util.Scanner;
public class HW4_Q2 {
	//This program determines whether or not the input valid per the Luhn formula.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //Create a scanner object
		String number = input.nextLine();  //Prompt the user to enter the numbers

		//Show the result to user
		if (validateNumber(number) == true)
			System.out.println("Number is Valid");
		else
			System.out.println("Number is Invalid");

		input.close();
	}


	//This method checks if a given number is valid or not
	public static boolean validateNumber (String number) {

		//Declare some necessary variables
		boolean result= true;
		int sum=0;
		String justnumbers= "";
		String DNumber = "";
		String LNumber = "";

		//Check if given string contains invalid characters
		for (int i = 0; i < number.length(); i++) {
			if((number.charAt(i)<'0' || number.charAt(i)>'9') && number.charAt(i) != ' ') {
				System.out.println("Invalid Input !");
				System.exit(0);
			}
		}

		//If the given string's length 1 or less, show invalid input message
		if(number.length()<=1) {
			System.out.println("Invalid Input !");
			System.exit(0);
		}

		//Create a string containing only numbers
		else {
			for (int i = 0; i < number.length(); i++) {
				if(Character.isDigit(number.charAt(i)) == true)
					justnumbers +=number.charAt(i);
			}
		}



		//Calculate sum of the digits
		for (int i = justnumbers.length()-2; i >=0; i-=2) {
			if((justnumbers.charAt(i)-'0') * 2 > 9) 
				sum += (justnumbers.charAt(i)-'0') * 2 - 9;

			else 
				sum += (justnumbers.charAt(i)-'0') * 2;
		}

		for (int i = justnumbers.length()-1; i >=0; i-=2) {
			sum += (justnumbers.charAt(i)-'0');
		}


		//Create DNumber string
		for (int i = 0 ; i < justnumbers.length(); i++) {
			if((justnumbers.length()-i) % 2 == 0)
				DNumber += (justnumbers.charAt(i)-'0');
			else 
				DNumber += "_";
		}

		//Create LNumber string
		for (int i = 0; i < DNumber.length(); i++) {
			if((justnumbers.length()-i) % 2 != 0)
				LNumber += (justnumbers.charAt(i)-'0');
			else 
				if((justnumbers.charAt(i)-'0') * 2 > 9) 
					LNumber += (justnumbers.charAt(i)-'0') * 2 - 9;

				else 
					LNumber += (justnumbers.charAt(i)-'0') * 2;

		}
		//Print DNumber and LNumber values
		System.out.println("DNumber:" + DNumber);
		System.out.println("LNumber:" + LNumber);

		//Check the input is valid or invalid according to the sum value
		if(sum / 10.0 % 2 == 0) 
			result=true;
		else 
			result = false;

		//Return a boolean value
		return result;
	}
}
