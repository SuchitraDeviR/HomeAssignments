package homeassignment.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
//				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set=new TreeSet<>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		System.out.println(set);
		
		List<Integer> list=new ArrayList<>(set);
		int size = list.size();
		Integer secNum = list.get(size-2);
		System.out.println("Second Largest is : " + secNum);
		
	}

}
