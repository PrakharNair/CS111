public class StringRec {
	public static void main(String[] args) {
		String compressedText = "q9r4f";
		decompress(compressedText);
	}//end main
	//Test
	
	public static String decompress(String compressedText)
	{
		char first = compressedText.charAt(0); //first char of string
		char second = compressedText.charAt(1); //second char of string
		int x = first - '0'; //turns letter into an int
		int y = second - '0'; // turns second letter into int
		if(x > 10 && y > 10) 
		{
			System.out.println(compressedText);
			return compressedText;
		}//base case
		
		else if(x < 10 && y > 10)
		{
			if(x == 1) { 
				return decompress(compressedText.substring(2) + second);
			}//This is for the recursion problem, because it allows for a seperate case, when the recursion sets up a new comppressedText. 
			
			return second + decompress(x-1 + compressedText.substring(1) + second);
		}//This is for the case if the leading characeter is a number and the second character is a letter.
		
		else if(x >= 42 && y < 10) {
			return decompress(compressedText.substring(1) + first);
		}//This is for the case if the leading character is a letter and the second character is a number
		
		else {
			return compressedText;
		}//this is if none of the other cases can be filled.
	}	
}