package employee;

import java.util.Scanner;

public class Employee
{

String empid;
String empname;
String department;
String designation;

	
	void getdata()
	{
Scanner ob=new Scanner(System.in);
System.out.println("enter mpid");
empid=ob.next ();
System.out.println("enter em");

empname=ob.next ();

department=ob.next();
designation=ob.next();
	}
void display()
{
System.out.println("name :"+empname);
System.out.println("id:"+empid);
System.out.println("department:"+department);
System.out.println("designation:"+designation);
}
}

