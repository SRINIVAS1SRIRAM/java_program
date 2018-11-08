package mypackage;

public class EmployeeMain
{
	public static void main(String arg[])
	{
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		Employee obj3=new Employee();
		
		
		obj1.displayEmployeeDetails();
		obj2.displayEmployeeDetails();
		obj3.displayEmployeeDetails();
		
		System.out.println("Total Salary of All Employees:"+Employee.getTotalSalary());
	}
}
