package homeassignment.week3.day2.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
			Arrays.sort(data);
			System.out.println("2nd element from the last : "+data[data.length-2]);
	}

}
