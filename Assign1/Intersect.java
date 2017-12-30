
public class Intersect {

	public static void main(String[] args) {
		System.out.println("Enter the constant d:");
		int d = IO.readInt();
		
		System.out.println("Enter the constant f:");
		int f = IO.readInt();
		
		System.out.println("Enter the constant g:");
		int g = IO.readInt();
		
		System.out.println("Enter the constant m:");
		int m = IO.readInt();
		
		System.out.println("Enter the constant b:");
		int b = IO.readInt();
		//These statements allow for the user to input data.
		
		
		/* I googled how to find the intersection between a line and a parabola, since I 
		 * wasn't actually very sure how. 
		 * Google states: 
		 * Find the points of intersection between the line and the parabola .
		 * Use the quadratic formula to find the roots of the quadratic equation. 
		 * Substitute the x-values in the linear equation to find the corresponding y-values. 
		 * Graph the parabola and the straight line on a coordinate plane.
		 * 
		 * Basically this means, that I have to find the quadratic equation, and since
		 * I don't know how to do algebra through Java, even if it is possible,
		 * A simple algorithm will allow us to find the correct answer.
		 * 
		 */
		
		/* Set the Equations equal to each other:
		 * mx + b = d*x^2 + fx + g
		 * 
		 * Then, make it a single equation the quadratic formula can be used:
		 * d*x^2 + fx - mx + g - b 
		 * 
		 * Now, since java can't differentiate between variables/like terms,
		 * it's important that i separate the like terms like this:
		 * d*x^2 + (f - m)x + (g - b)
		 * 
		 * Now, i can use java to find the values of d, (f - m), and (g - b)
		 * 
		 */
		 
		int x = f - m;
		/*This evaluates the value of the x coefficients. This allows us to use it in the 
		 * Discriminant formula. 
		 */
		
		int y = g - b;
		//This evaluates the value of the constants. 
		
		
		double discriminant = x*x - 4 * d * y;
		/*This will determine how many roots there are in general.
		 * If the discriminant is greater 0, there are 2 roots
		 * If the discriminant is 0, there is 1 root
		 * If the discriminant is less than 0, there are no roots.
		 * Now will begin a series of if statements to determine the the output
		 */
		
		if (discriminant > 0.0) {
			double x1 = (-x + Math.sqrt(discriminant)) / (2.0 * d);
			double x2 = (-x - Math.sqrt(discriminant)) / (2.0 * d);

			double y1 = m * x1 + b;
			double y2 = m * x2 + b;
			
			System.out.println("The intersections are: ");
			System.out.println("(" + x1 + "," + y1 + ")");
			System.out.println("(" + x2 + "," + y2 + ")");
		}
		//Discriminant is greater than 0, so there are 2 roots
		
		
		else if(discriminant == 0) {
			double x1 = (-x + Math.sqrt(discriminant)) / (2.0 * d);
			double y1 = m * x1 + b;
			
			x1 = (int)(x1);
			
			System.out.println("The intersection is: ");
			System.out.println("(" + x1 + "," + y1 + ")");

		}
		//Discriminant is equal to 0, so there is 1 root
		
		else {
			System.out.println("None");
		}
		//Discriminant is less than 0, so there are no roots.
	}
}
