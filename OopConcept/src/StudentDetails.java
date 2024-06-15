class Student{
	int rollNum;
	String studName;
	double mark1;
	double mark2;
	double mark3;
	double totalMarks;
	double averageMark;
	
	Student(int rollNum,String studName,double mark1,double mark2,double mark3)
	{
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		calculateTotal();
		averageMark();
	}
	
	void calculateTotal() 
	{
		totalMarks = mark1 + mark2 + mark3;
	}
	
	void averageMark()
	{
		averageMark = totalMarks/3;
	}
	
	void displayStudDetails()
	{
		System.out.println("Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average Marks: "+averageMark);
		System.out.println();
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Student s1 = new Student(14,"Rohan", 99,100,87.5);
		s1.displayStudDetails();
		
		Student s2 = new Student(15, "Aravind", 100,100,67);
		s2.displayStudDetails();
	}

}
