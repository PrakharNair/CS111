/* Prakhar Nair
 * CS-111
 * Sum.java
 * Professor Sesh Venugopal
 */

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y; 
		
		System.out.println("Enter the first number: ");
		//Prints text to ask the user for a value to store for x
		
		x = IO.readInt();
		/* Uses method in IO.java and stores a value given from the 
		*  user as x. 
		*/
		
		System.out.println("Enter the second number:  ");
		//Prints text to ask the user for a value to store for y
		
		y = IO.readInt();
		/* Uses method in IO.java and stores a value given from the user 
		*  as y. 
		*/	
		
		int result = x + y; 
		//Initialize an integer named result to find the sum of x and y. 
		
		System.out.println("Result: "+ result);
		//Print result to the user
		
	}
}
