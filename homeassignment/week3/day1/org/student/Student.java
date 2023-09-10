package homeassignment.week3.day1.org.student;

import homeassignment.week3.day1.org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("studentName in Sudent CLass");
	}
	public void studentDept()
	{
		System.out.println("studentDept in Sudent CLass");
	}
	public void studentId()
	{
		System.out.println("studentId in Sudent CLass");
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}
