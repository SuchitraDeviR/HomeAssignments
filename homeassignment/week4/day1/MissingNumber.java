package homeassignment.week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] nums= {1,2,3,5,4,3,4,6,8,9};
		Set<Integer> misNum=new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			misNum.add(nums[i]);
		}
		System.out.println(misNum);
		
		
		}
		
		
	}


