package homeassignment.week3.day2.strings;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		/* Pseudo Code:
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	*/
		
		String test = "I am a software tester"; 
		String[] words = test.split(" ");
		String reverseWords = "";
		for (int i = 0; i <= words.length-1; i++) {
			if (i % 2!=0) {
			//	reverswordseWords=words[i];
				char[] charArray = words[i].toCharArray();
				for (int j = charArray.length-1; j >=0 ; j--) {
					System.out.print(charArray[j]);
				}
			}
			else
			{
				System.out.print(" "+words[i]+" ");
			}
		}
		
		
		
		System.out.println(reverseWords);
	}

}
