public class PigLatin {

	
	public static void main(String[] args) {
		System.out.println("Enter a word that you would like to be translated into piglatin");
		System.out.println(translate(IO.readString()));
		
		//Testing the method
	}//end main method
	
	
	public static String translate(String original){
		char firstLetter;
		//initialize a character. There will be a value that will be assigned to this.
		String newWord;
		//initialize the new word. This will be the new word, translated into pig latin.
		
		firstLetter = original.charAt(0);
		/* This sets the character that was initialized previously to a value.
		 * "charAt();" method allows for char at the specific value. I chose 0, so it would denote the
		 * first character. 
		 */
		
		if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
			newWord = original + "way";
		}//This is a separate if statement that pertains to a word that starts with a vowel
		
		else {
			newWord = original.substring(1) + original.charAt(0) + "ay";
		}//This is a statement that does not fall under the if statement aformentioned.
		return newWord;	
		//ultimately returns a value. 
	}//end translate method
}//end class

