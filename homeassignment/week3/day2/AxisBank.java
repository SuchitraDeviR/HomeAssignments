package homeassignment.week3.day2;

public class AxisBank extends BankInfo{

		
	public void deposit()
	{
		System.out.println("Deposit method from AxisBank");
	}
	
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
	}
}
