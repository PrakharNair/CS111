public class Compress {

	public static void main(String[] args) {
		System.out.println("Test");
		System.out.println(compress(IO.readString()));
	}//end main method
	
	public static String compress(String original){
	    int counter;
	    //counter for the actual number. 
	    String s = "";
	    //Altered string at the end

	    for (int i=0; i < original.length(); i++) {
	        char a = original.charAt(i);
	        counter = 1;
	        //sets the counter equal to 1, since leaving it uninitialized sets it equal to 0.

	        while (i + 1 < original.length() && original.charAt(i) == original.charAt(i+1)) {
	            counter++;
	            i++;
	        }
	        //increments counter and i if condition is met. 
	        if (counter == 1) {
	            s = s.concat(Character.toString(a));
	        }//end if 
	        
	        else {
	            s = s.concat(Integer.toString(counter).concat(Character.toString(a)));
	        }//end else
	    }

	    return s;
	    //returns string fully compressed. 
	}
	
}
