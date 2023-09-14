package homeassignment.week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		// get the length of the array		
		// sort the array			
		// Iterate it in the reverse order
		// print the array			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		
		String[] names= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int length = names.length;
		
		Set<String> set=new TreeSet<>();
		
		for (int i = length-1; i >=0 ; i--) {
			set.add(names[i]);
		}
		System.out.println(set);
	}

}
