class Employee{
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int eno, String ename, double esal)
	{
		empNum = eno;
		empName = ename;
		empSalary = esal;
	}
	void dispEmpDetails()
	{
		System.out.println("Employee Number: "+ empNum);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Salary: "+ empSalary);
		System.out.println();
	}
}


public class EmployeeData {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpDetails(10952, "Rohan", 57200.50);
		e1.dispEmpDetails();
		
		Employee e2 = new Employee();
		e2.setEmpDetails(10967, "Aravind", 78000.78);
		e2.dispEmpDetails();		
	}

}
