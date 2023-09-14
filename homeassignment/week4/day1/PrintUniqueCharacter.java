package homeassignment.week4.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name="Harshini";
		name = name.toLowerCase();
		char[] chName=name.toCharArray();
		
		Set<Character> set=new HashSet<>();
		for (Character each : chName) {
			set.add(each);
		}
		
		System.out.println(set);
		char dup=' ';
		for (int i = 0; i < chName.length-1; i++) {
			for (int j = i+1; j < chName.length; j++) {
				if(chName[i]==chName[j])
				{
					dup=chName[i];
					System.out.println("Duplicate Character : "+dup); 
					set.remove(dup);
					
				}
			}
									
			}
		
		System.out.println("Unique Characters in a string : " +set);

		
		}

}
