class Student{
	int rollNum;
	String studName;
	double mark1;
	double mark2;
	double mark3;
	double totalMarks;
	
	void setStudDetails(int rollNum,String studName,double mark1,double mark2,double mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	void calculateTotal() 
	{
		totalMarks = mark1 + mark2 + mark3;
	}
	
	void displayStudDetails()
	{
		System.out.println("Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Total Marks: "+totalMarks);
		System.out.println();
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStudDetails(14,"Rohan", 98.5,79,88.5);
		s1.calculateTotal();
		s1.displayStudDetails();
	}

}
