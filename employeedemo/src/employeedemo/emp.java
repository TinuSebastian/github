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
	System.out.println("enter basic salary");
	basicsalary= scanner.nextInt();
	System.out.println("enter allowances");
	allowances=scanner.nextInt();
	System.out.println("enter deductions");
	deductions=scanner.nextInt();
	}

	

	public emp(String empid, String empname, int basicsalary, int allowances, int deductions, int netsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.basicsalary = basicsalary;
		this.allowances = allowances;
		this.deductions = deductions;
		this.netsalary = netsalary;
	}

void display()
{
	System.out.println("empid"+empid);
	System.out.println("empname"+empname);
}

	void calc()
	{
		  netsalary=(basicsalary+allowances-deductions);
	System.out.println(+netsalary);
	}

}
