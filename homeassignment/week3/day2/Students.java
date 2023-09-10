package homeassignment.week3.day2;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("getStudentInfo method with no argument");
	}
	
	public void getStudentInfo(int id)
	{
		System.out.println("getStudentInfo method with id : " + id );
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("getStudentInfo method with id : " + id + " and name : "+ name);
	}

	public void getStudentInfo(String phoneNumber, String email)
	{
		System.out.println("getStudentInfo method with phoneNumber : " + phoneNumber + " and email : "+ email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st=new Students();
		st.getStudentInfo();
		st.getStudentInfo(37);
		st.getStudentInfo(37, "Suchi");
		st.getStudentInfo("9876543211", "suchi@gmail.com");
	}

}
