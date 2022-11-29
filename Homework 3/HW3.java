import java.util.Scanner;
public class HW3 {
	//This program draws a coordinate system and some geometric shapes on the console. 

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//A loop that will continue until the user chooses exit 
		while(true) {	

			//Prompt the user which shape her/his want to draw
			System.out.println("Which shape would you like to draw? "
					+ "\n1. Line "
					+ "\n2. Triangle "
					+ "\n3. Rectangle "
					+ "\n4. Parabola "
					+ "\n5. Circle "
					+ "\n6.Exit");

			int selection = input.nextInt();
			System.out.println();

			//A switch statement to call the corresponding method
			switch(selection) {
			case 1: LineGraphic(); break;
			case 2: TriangleGraphic(); break;
			case 3: RectangleGraphic(); break;
			case 4: ParabolaGraphic(); break;
			case 5: CircleGraphic(); break;
			case 6: System.exit(0);
			}
		}
	}

	//Methods for each shape 
	public static void LineGraphic() {	
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the necessary values
		System.out.print("Line formula is y = ax + b\r\n" + 
				"Please enter the coefficients a and b:");	
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println();

		//A loop for draw a line
		for (int y = 10; y >= -11; y--) {

			if(y!=0) {
				for (int x = -10; x <= 11; x++) {					
					if (y==10 && x==0)
						System.out.print("y");  //Y axis
					else if (y==a*x+b)
						System.out.print("*");  //Calculate equation of the line and put * if point is on the line
					else if (x==0)
						System.out.print("|");
					else 
						System.out.print(" ");  //Blanks
				}
			}

			//For y=0 line
			else {
				for(int x= -10; x <= 11; x++) {
					if(x==11) 
						System.out.print("x");   //X axis
					if (y==a*x+b)
						System.out.print("*"); //Points on the line at y=0 
					else if (x==0)
						System.out.print("|");
					else if (x<11)
						System.out.print("-");
				}	
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	public static void ParabolaGraphic() {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the necessary values
		System.out.print("Parabola formula is y = ax^2 + bx + c\r\n" + 
				"Please enter the coefficients a, b and c:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println();

		//A loop for draw a parabola
		for (int y = 10; y >= -11; y--) {
			if(y!=0) {
				for (int x = -10; x <= 11; x++) {					
					if (y==10 && x==0)
						System.out.print("y");  //Y axis
					else if (y==a*x*x+b*x+c)
						System.out.print("*"); //Calculate equation of the parabola and put * if point is on the parabola
					else if (x==0)
						System.out.print("|");
					else 
						System.out.print(" ");  //Blanks
				}
			}

			//For y=0 line
			else {
				for(int x= -10; x <= 11; x++) {
					if(x==11) 
						System.out.print("x");   //X axis
					if (y==a*x*x+b*x+c)
						System.out.print("*");  //Points on the line at y=0 
					else if (x==0)
						System.out.print("|");
					else if (x<11)
						System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}		

	public static void CircleGraphic() {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the necessary values
		System.out.print("Circle formula is (x-a)^2 + (y-b)^2 = r^2\r\n" + 
				"Please enter the coordinates of the center (a,b) and the radius:");
		int a = input.nextInt();
		int b = input.nextInt();
		int r = input.nextInt(); //radius

		System.out.println();

		//A loop for draw a circle
		for (int y = 10; y >= -11; y--) {
			if(y!=0) {
				for (int x = -10; x <= 11; x++) {					
					if (y==10 && x==0)
						System.out.print("y");  //Y axis
					else if (r*r==(x-a)*(x-a)+(y-b)*(y-b))  //Calculate equation of circle and put * if point is on the circle
						System.out.print("*");	//Points on the line 
					else if (x==0)
						System.out.print("|");
					else 
						System.out.print(" ");	//Blanks
				}
			}
			//For y=0 line
			else {
				for(int x= -10; x <= 11; x++) {
					if(x==11) 
						System.out.print("x");   //X axis
					if (r*r==(x-a)*(x-a)+(y-b)*(y-b))	//circle equation
						System.out.print("*");	//Points on the line at y=0 
					else if (x==0)
						System.out.print("|");
					else if (x<11)
						System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}

	public static void RectangleGraphic() {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the coordinates of the vertices
		System.out.print("For rectangle, we need the coordinates of the points for three vertices.\r\n" + 
				"Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();

		//Calculate coordinates of missing point
		int x4 = x2+x3-x1; 
		int y4 = y2+y3-y1;

		//Calculate and check if the given points construct a rectangle
		double side2 = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		double side1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double hypotenuse = Math.sqrt(1.0*(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		boolean check = (Math.sqrt(Math.pow(hypotenuse,2))) == (Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)));

		//If the given points can construct a rectangle, draw that rectangle
		if(check) {
			//A loop for draw a triangle
			for (int y = 10; y >= -11; y--) {
				if(y!=0) {
					for (int x = -10; x <= 11; x++) {					
						if (y==10 && x==0)
							System.out.print("y");  //Y axis

						//Calculate equation of sides and put * if point is on edge
						else if  (((((y-y1)*(x3-x1)) == ((y3-y1)*(x-x1)) && y<=Math.max(y1, y3) && y>=Math.min(y1, y3) && x<=Math.max(x1, x3) && x>=Math.min(x1, x3)))
								|| (((y-y2)*(x1-x2)) == ((y1-y2)*(x-x2)) && y<=Math.max(y1, y2) && y>=Math.min(y1, y2) && x<=Math.max(x2, x1) && x>=Math.min(x2, x1))
								|| (((y-y3)*(x3-x4)) == ((y3-y4)*(x-x3)) && y<=Math.max(y3, y4) && y>=Math.min(y3, y4) && x<=Math.max(x4, x3) && x>=Math.min(x4, x3))
								|| (((y-y4)*(x4-x2)) == ((y4-y2)*(x-x4)) && y<=Math.max(y4, y2) && y>=Math.min(y4, y2) && x<=Math.max(x4, x2) && x>=Math.min(x4, x2)))
							System.out.print("*");

						else if (x==0)
							System.out.print("|");
						else 
							System.out.print(" "); //Blanks
					}
				}
				//For y=0 line
				else {
					for(int x= -10; x <= 11; x++) {
						if(x==11) 
							System.out.print("x");   //X axis

						//Calculate equation of sides and put * if point is on edge at y=0
						else if  (((((y-y1)*(x3-x1)) == ((y3-y1)*(x-x1)) && y<=Math.max(y1, y3) && y>=Math.min(y1, y3) && x<=Math.max(x1, x3) && x>=Math.min(x1, x3)))
								|| (((y-y2)*(x1-x2)) == ((y1-y2)*(x-x2)) && y<=Math.max(y1, y2) && y>=Math.min(y1, y2) && x<=Math.max(x2, x1) && x>=Math.min(x2, x1))
								|| (((y-y3)*(x3-x4)) == ((y3-y4)*(x-x3)) && y<=Math.max(y3, y4) && y>=Math.min(y3, y4) && x<=Math.max(x4, x3) && x>=Math.min(x4, x3))
								|| (((y-y4)*(x4-x2)) == ((y4-y2)*(x-x4)) && y<=Math.max(y4, y2) && y>=Math.min(y4, y2) && x<=Math.max(x4, x2) && x>=Math.min(x4, x2)))
							System.out.print("*");

						else if (x==0)
							System.out.print("|");

						else if (x<11)
							System.out.print("-");
					}
				}
				System.out.println();
			}
		}
		//If the given points do not construct a rectangle, show an error message
		else
			System.out.println("\nThe given points do not construct a rectangle");

		System.out.println("\n\n");
	}

	public static void TriangleGraphic() {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		//Prompt the user to enter the coordinates of the vertices
		System.out.print("For triangle, we need the coordinates of the points for three vertices.\r\n" + 
				"Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();


		//A loop for draw a triangle
		for (int y = 10; y >= -11; y--) {
			if(y!=0) {
				for (int x = -10; x <= 11; x++) {					
					if (y==10 && x==0)
						System.out.print("y");  //Y axis

					//Calculate equation of sides and put * if point is on edge 
					else if  (((((y-y1)*(x2-x1)) == ((y2-y1)*(x-x1)) && y<=Math.max(y1, y2) && y>=Math.min(y1, y2) && x<=Math.max(x1, x2) && x>=Math.min(x1, x2)))
							|| (((y-y2)*(x3-x2)) == ((y3-y2)*(x-x2)) && y<=Math.max(y3, y2) && y>=Math.min(y3, y2) && x<=Math.max(x2, x3) && x>=Math.min(x2, x3))
							|| (((y-y3)*(x1-x3)) == ((y1-y3)*(x-x3)) && y<=Math.max(y1, y3) && y>=Math.min(y1, y3) && x<=Math.max(x1, x3) && x>=Math.min(x1, x3)))
						System.out.print("*");

					else if (x==0)
						System.out.print("|");
					else 
						System.out.print(" ");	//Blanks
				}
			}
			//For y=0 line
			else {
				for(int x= -10; x <= 11; x++) {
					if(x==11) 
						System.out.print("x");   //X axis

					//Calculate equation of sides and put * if point is on edge at y=0
					else if  (((((y-y1)*(x2-x1)) == ((y2-y1)*(x-x1)) && y<=Math.max(y1, y2) && y>=Math.min(y1, y2) && x<=Math.max(x1, x2) && x>=Math.min(x1, x2)))
							|| (((y-y2)*(x3-x2)) == ((y3-y2)*(x-x2)) && y<=Math.max(y3, y2) && y>=Math.min(y3, y2) && x<=Math.max(x2, x3) && x>=Math.min(x2, x3))
							|| (((y-y3)*(x1-x3)) == ((y1-y3)*(x-x3)) && y<=Math.max(y1, y3) && y>=Math.min(y1, y3) && x<=Math.max(x1, x3) && x>=Math.min(x1, x3)))
						System.out.print("*");

					else if (x==0)
						System.out.print("|");
					else if (x<11)
						System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
}




