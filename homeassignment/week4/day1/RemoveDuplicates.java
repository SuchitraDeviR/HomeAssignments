package homeassignment.week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
//		Declare a String as "PayPal India"
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print it
		
		String name= "PayPal India";
		name=name.replace(" ", "");
		char[] chName=name.toCharArray();
		System.out.println(chName);
		
		Set<Character> charSet=new LinkedHashSet<>();
		Set<Character> dupCharSet=new LinkedHashSet<>();
		
		for (int i = 0; i < chName.length; i++) {
			charSet.add(chName[i]);
			if (charSet.equals(chName[i])) {
				dupCharSet.add(chName[i]);
			}
			if (chName[i]==' ') {
				dupCharSet.remove(chName[i]);
				System.out.println("Empty String identified");
			}
			charSet.remove(dupCharSet);
		}
		
		System.out.println(charSet);
	}

}
