package homeassignment.week3.day2.arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray= {3,2,11,4,6,7};
		int[] secArray= {1,2,8,4,9,7};
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = i; j < secArray.length; j++) {
				if (firstArray[i]==secArray[j]) {
					System.out.println(firstArray[i]);
				}
				
			}
		}
		
	}

}
