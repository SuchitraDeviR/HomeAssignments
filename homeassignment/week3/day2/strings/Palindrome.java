package homeassignment.week3.day2.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String name="madam";
		String rev="";
		char[] newName=name.toCharArray();
		for (int i = newName.length-1; i >= 0; i--) {
			rev = rev + newName[i];  
			
		}
		System.out.println(rev);
		if (name.equals(rev)) {
			System.out.println("Entered string is a palindrome."); 
		}
		      else  
		         System.out.println("Entered string isn't a palindrome.");   
		}
	}


