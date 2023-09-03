package Week3.day1.Assignment2;

public class Student extends Department {

	
	public void Studentname()
	{
		System.out.println("Student name is Magesh S");
	}

	public void Studentdepartment()
	{
		System.out.println("Magesh is CSE");
	}
		public void studentid()
		{
			System.out.println("Student id is 3137");
		}
	

public static void main(String[] args) {
	
	
	Student st = new Student();
	
	st.collegeCode();
	st.collegeName();
	st.collegeRank();
	st.Studentdepartment();
	st.studentid();
	st.deptname();
	
}

}



