/* Prakhar Nair
 * CS-111
 * Sum.java
 * Professor Sesh Venugopal
 */

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z; 
		//initializes three roots that we will ask the user for. 
		
		
		System.out.println("Enter the first root: ");
		x = IO.readInt();
		
		System.out.println("Enter the second root: ");
		y = IO.readInt();
		
		System.out.println("Enter the third root: ");
		z = IO.readInt();
		//This sequence asks for the user to input 3 roots. 
		
		
		int x1 = -x;
		int y1 = -y;
		int z1 = -z;
		/* During calculations, the patterns that I found when finding parts 
		  of the polynomial could only be found through finding the negative version of 
		  the values. For example, if the user inputted x = 1, without making x1 = -x, 
		  all the if statements would be inverted, because the calculations below would
		  be the negative version of the calculations. 
		 */
		
		
		
		int a = (x1 + y1 + z1);
		//Calculations for finding the x^2 coefficient
		int b = (x1*y1) + (z1*(x1+y1));
		//Calculations for finding the x coefficient
		int c = (x1 * y1 * z1);
		//Calculations for finding the final coefficient
		
		System.out.print("x^3");
		/*
		This allows for x^3 be printed, as it will never change even if a/b/c are negative/positive
		Using System.out.print(); statements, like Professor Sesh said we could in lecture,
		allows for a cleaner, and more effective piece of code. System.out.print(); does not
		separate lines, like System.out.Println(); would do.  
		*/
		
		if(a < 0) {
			System.out.print(" - " + -a + "x^2");
		}
		else {
			System.out.print(" + " + a + "x^2");
		}
		/*
		 This code dictates what to print whether a is positive/negative.
		 */
		
		
		
		if(b < 0) {
			System.out.print(" - " + -b + "x");
		}
		else {
			System.out.print(" + " + b + "x");
		}
		/*
		 This code dictates what to print whether b is positive/negative.
		 */
		
		if(c < 0) {
			System.out.print(" - " + -c); 
		}
		else {
			System.out.print(" + " + c);
		}
		/*
		 This code dictates what to print whether c is positive or negative. 
		 */
		

		
		/*if (a < 0 && b < 0 && c < 0) {
			System.out.println("x^3 - " + -a + "x^2 - " + -b + "x - " + -c);
		}
		//This applies if a, b, and c are negative
		
		
		else if (a < 0 && b < 0 && c > 0) {
			System.out.println("x^3 - " + -a + "x^2 - " + -b + "x + " + c);
		}
		//This applies if a and be are negative, but c is positive. 
		
		
		else if (a < 0 && b > 0 && c < 0) {
			System.out.println("x^3 - " + -a + "x^2 + " + b +"x - " + -c);
		}
		//This applies if a and c are negative, but b is positive.
		
		else if (a < 0 && b > 0 && c > 0) {
			System.out.println("x^3 - " + -a + "x^2 + " + b +"x + " + c);
		}
		//This applies if a is negative, but b and c are positive. 
		
		
		else if (a > 0 && b < 0 && c < 0) {
			System.out.println("x^3 + " + a + "x^2 - " + -b +"x - " + -c);
		}
		//This applies if b and c are negative, but a is positive. 
		
		
		else if (a > 0 && b < 0 && c > 0) {
			System.out.println("x^3 + " + a + "x^2 - " + -b +"x + " + c);
		}
		//This applies if b is negative, but a and c are positive. 
		
		else if (a > 0 && b > 0 && c < 0) {
			System.out.println("x^3 + " + a + "x^2 + " + b +"x - " + -c);
		}
		//This applies if c is negative, but a and b are positive. 
		
		
		else {
			System.out.println("x^3 + " + a + "x^2 + " + b +"x + " + c);
		}
		//This applies if a, b, and c are positive. 
		*/
		/*
		Above was the original algorithm and formula I used for printing the true solution
		I found that this code was too "clunky" and just seemed to be inconvenient to read 
		through. I left it in, in case I choose to revert back to it for other programs, 
		otherwise, the if/else statements that are not in code is the clearer version for printing
		the correct result(s).
		*/
	}

}
