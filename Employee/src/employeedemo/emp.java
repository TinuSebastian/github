package employeedemo;

import java.util.Scanner;
public class emp 
{
	String empid;
	String empname;
	int basicsalary;
	int allowances;
	int deductions;
	int netsalary;
	 void empdet()
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter employee name");
	empname= scanner.next();
	System.out.println("enter employee id");
	empid=scanner.next();
	System.out.println("enter basic salary");
	basicsalary= scanner.nextInt();
	System.out.println("enter allowances");
	allowances=scanner.nextInt();
	System.out.println("enter deductions");
	deductions=scanner.nextInt();
	}

	

	

void display()
{
	System.out.println("empid"+empid);
	System.out.println("empname"+empname);
	System.out.println("basicsalary"+basicsalary);
	System.out.println("allowances"+allowances);
	System.out.println("deductions"+deductions);
	System.out.println("Net Salary :"+netsalary);
	
	}

	void calc()
	{
		  netsalary=(basicsalary+allowances-deductions);
		  //System.out.println("net salary :"+netsalary);
		  //return netsalary;
	}

}
