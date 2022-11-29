import java.util.Scanner;

public class HW4_Q1 {
	public static void main(String[] args) {
		// This program calculates the invoice of each flat in an apartment building

		Scanner input = new Scanner(System.in);		//Create a scanner object
		int flatnumber = input.nextInt();

		//Create some arrays
		double[] mylist = new double[flatnumber+2];    //Contains all of the input
		double[] consumptions= new double [flatnumber];  //Contains consumptions of each flat
		double[] bills = new double[flatnumber];  //Contains bills of each flat 

		//Declare mylist array
		mylist[0]=flatnumber;
		for (int i=1; i < mylist.length; i++) {
			mylist[i]=input.nextDouble();
		}

		//Declare consumptions array
		for (int j =0; j < flatnumber; j++) {
			consumptions[j]= mylist[j+1];
		}

		//Call calculateTheinvoice method 
		bills = calculateTheInvoice(consumptions , mylist[mylist.length-1]);

		//Call printBills method
		printBills(bills);

		input.close();

	}

	//This method calculates each flat's bills
	public static double[] calculateTheInvoice (double[] flats, double totalBill) {

		double[] bills = new double[flats.length]; //Create an array
		double totalconsumption = 0;

		//Declare the array
		for (int i = 0; i < flats.length; i++) {
			totalconsumption += flats[i];
		}
		for (int i = 0; i < flats.length; i++) {
			bills[i]=(((totalBill*0.3)/flats.length) + ((totalBill*0.7) / totalconsumption * flats[i]));  //Calculate bills

		}
		return bills;
	}

	//This method prints each flats bills
	public static void printBills (double[] bills) {
		for (int i = 0; i < bills.length; i++) {
			System.out.print("Flat #" + (i+1) + ": " + (int) (bills[i]*100) /100.0 + "\n");
		}
	}
}
