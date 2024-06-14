class Employee2{
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int empNum, String empName, double empSalary)
	{
		this.empNum = empNum;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	void dispEmpDetails()
	{
		System.out.println("Employee Number: "+ empNum);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Salary: "+ empSalary);
		System.out.println();
	}
}


public class EmployeeData2 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.setEmpDetails(10952, "Rohan", 57200.50);
		e1.dispEmpDetails();
		
		Employee2 e2 = new Employee2();
		e2.setEmpDetails(10967, "Aravind", 78000.78);
		e2.dispEmpDetails();		
	}

}
