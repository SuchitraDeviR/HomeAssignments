package homeassignment.week1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=-120;
		int newNumber;
		if(number<0)
		{
			newNumber=-(number);
			System.out.println("The number " + number +" is converted to "+newNumber);
		}
		else 
			System.out.println("The positive number is " + number);
	}

}
