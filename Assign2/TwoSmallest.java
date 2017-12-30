public class TwoSmallest {
	public static void main(String[] args ) {
		System.out.println("Enter a terminating number, that signals the end of the set of numbers");
		double term = IO.readDouble();
		//This allows for the current min values to be infinty, so it doesnt start at 0.
		//This makes the first thing the user enters to be the true min, and finds the actual min from there
		//This is similar to finding the min in "Scores" but since there is no range, infinity is the only number
		//That ALWAYS has a minimum
		double min1 = IO.readDouble();
			
		while (min1 == term) {
	          	IO.reportBadInput();
	           	min1 = IO.readDouble();
	   	}
		double min2 = IO.readDouble();
	    while (min2 == term) {
	            IO.reportBadInput();
	            min2 = IO.readDouble();
	    }
	    //This will prompt the user to input a new value if they try to use the term value 
	    //Right after they input it at first
	   
	    
	    double inputValue;
	    while ((inputValue =IO.readDouble())  != term) {
	        	if (inputValue < min1) { 
	                min2 = min1; 
	                min1 = inputValue; 
	            } 
	        	//If the input value is less than min1, that means min2 is set equal to min1
	        	//This also makes min 1 the new input value for when the loop repeats itself.
	            else if (inputValue < min2) { 
	                min2 = inputValue; 
	            } 
	        	//This condition applies if the first one does not, and states that the value
	        	//is not less than min1, but less than min2, therefore it resets the value of min2. 
	    }
		IO.outputDoubleAnswer(min1);
		IO.outputDoubleAnswer(min2);
	}
}
