package mypackage;

import java.util.Scanner;

public class Employee 
{
	int empId;
	String empName;
	int salary;
	
	static int totalSalary;
	
	public Employee()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		empId=scanner.nextInt();
		
		System.out.println("Enter Employee Name:");
		empName=scanner.next();
		
		System.out.println("Enter Employee Salary:");
		salary=scanner.nextInt();
		
		totalSalary=totalSalary+salary;
	}
		
	public void displayEmployeeDetails()
	{
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+salary);
	}
	
	public static int getTotalSalary()
	{
		return totalSalary;
	}
	
}
