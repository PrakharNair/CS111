
public class Scores {
	public static void main(String[] args) {
		
		System.out.println("How many judges are there?");
		int judgeNumber = IO.readInt();
		//Uses the IO to ask for the number of judges. This allows only for integers
		if (judgeNumber < 0) {
			IO.reportBadInput();
		}
		//Prompts the user to select a new input if the value is below 0. 
		
		System.out.println("Input scores:");
		//Prompts the use to input scores
		double total = 0;
		//Allows us to find the average
		double max = 0.0;
		double min = 10.0;
		/*I realized that the only way to check for the max and the min was to find a way
		 * to redeclare the variables for max and min to know which values to leave out.
		 * because of this, the for loop will compare every value inputted as a max or min.
		 * If a score is higher than the max, it will become the new max.
		 * If a score is higher than the min, it will become the new min.
		 * The reason i'm starting max at 0, and min at 10 is so that the first value will have to become 
		 * the min and the max, allowing for calculations to occur after that.
		*/
		double score;
		//initialize score
		
		for(int i = 0; i < judgeNumber; i++) {
			score = IO.readDouble();
			if(score < 0.0 || score > 10.0) {
				IO.reportBadInput();
				i = i - 1; //Needed so the counter doesn't go up for a bad loop, therefore it doesn't count. 
			}//prompts user to re-input.
			
			else {
				if(score < min) {
					min = score;
				}//makes a new value for min
				if(score > max) {
					max = score;
				}//makes a new value for max
				total = total + score; //Counts up the total.
			}
			//This else loop allows the loop to reset if a bad input is used, rather than using the 
			//The bad input
			
		}
		//A loop is necessary since the amount of judges isn't expressly said.
		
		double average = (total - min - max) / (judgeNumber - 2); 
		IO.outputDoubleAnswer(average);
	}
}
