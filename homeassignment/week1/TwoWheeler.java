package homeassignment.week1;

public class TwoWheeler {
		
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=156789;
		boolean isPunctured=false;
		String bikeName="Scooty Streak";
		double runningKM=10250.78;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler scooty = new TwoWheeler();
		System.out.println("No of Wheels : " +scooty.noOfWheels);
		System.out.println("No of Mirrors : " +scooty.noOfMirrors);
		System.out.println("Chassis Number : " +scooty.chassisNumber);
		System.out.println("Is Punctured : " +scooty.isPunctured);
		System.out.println("Bike Name : " +scooty.bikeName);
		System.out.println("Running KM : " +scooty.runningKM);
		
		
	}

}
