
public class NthPrime {
	public static void main(String[] args) {
		System.out.println("enter n to compute the nth prime number ");
		int n = IO.readInt();
		while (n < 1) {
			IO.reportBadInput();
			n = IO.readInt();
		}
		//If the number entered is 0 or below, it won't work with the program.
		
		int i; 
		//A count of sort, used for finding the next prime number.
		int num = 1;
		//Allows for finding the prime number.
		int counter = 0; 
		//Counter to allow for the prime number to be found
		
		/*The reason that these need to be declared ahead of time is because the while loop that follows
		 * will look for a prime number 1 at a time. therefore, it needs to be incremented by counter
		 * So that it can find the nth prime number. 
		 */
		
		while (counter < n) {
			//This states that if the counter is less than n. If the counter is greater than n, or equal to
			//The while loop served its purpose, and the prime number is already found.
			num = num+1;
			//Looks for next prime number
			for (i = 2; i <= num; i++){
				if (num % i == 0) {
					break; 
					//Break means that it will jump out of the for loop.
					//Break is a very powerful statement, as if used incorrectly, it will alter the program.
					//Break works here because it will direct to the next if statement that follows. 
				}
				//this for loop cannot be used. if num % i = 0.
				//This also increments i, and allows for the comparison in the next if statement
			}
			if (i == num) {
				counter = counter+1; 
			}
			//This shows that a prime number is found, and will increment the counter, so that the next counter
			//Can be found
		}
		IO.outputIntAnswer(num);
		//Output the answer. 
	}
}
