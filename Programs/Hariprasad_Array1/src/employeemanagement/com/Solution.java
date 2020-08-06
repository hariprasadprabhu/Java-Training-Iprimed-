package employeemanagement.com;

import java.util.Scanner;

abstract class Employee
{
	int id,age;
	String name,desig;
	long salary;
	public Employee(int id, int age, String name, String desig, long salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	Scanner s = new Scanner(System.in);
	abstract void raiseSalary();
	
	void display()
	{
		System.out.println("Employee Id:"+this.id+"\nEmployee Name:"+this.name+"\nSalary : "+this.salary+"\nAge: "+this.age+"\nDesignation: "+this.desig);
	}
}
class Cleark extends Employee
{

	public Cleark(int id, int age, String name, String desig, long salary) {
		super(id, age, name, desig, salary);
	}

	@Override
	void raiseSalary() 
	{
		System.out.println("enter the amount you want to increase");
		long amt = s.nextLong();
		super.salary=super.salary+amt;
		System.out.println("amount raaised to"+super.salary);
	}
	
}
class Programmer extends Employee
{

	public Programmer(int id, int age, String name, String desig, long salary) {
		super(id, age, name, desig, salary);
	}

	@Override
	void raiseSalary() 
	{
		System.out.println("enter the amount you want to increase");
		long amt = s.nextLong();
		super.salary=super.salary+amt;
		System.out.println("amount raaised to"+super.salary);
	}
	
}
class Manager extends Employee
{

	public Manager(int id, int age, String name, String desig, long salary) {
		super(id, age, name, desig, salary);
	}

	@Override
	void raiseSalary() 
	{
		System.out.println("enter the amount you want to increase");
		long amt = s.nextLong();
		super.salary=super.salary+amt;
		System.out.println("amount raaised to"+super.salary);
	}
	
}

public class Solution {
	static Scanner sc =new Scanner(System.in);
	static String[] reader()
	{
		String[] s = new String[5];
		System.out.print("Enter Employee Id:");
		s[0] = sc.next();
		System.out.print("Enter Employee Name:");
		s[1] = sc.next();
		System.out.print("Enter Employee Age:");
		s[2] =sc.next();
		if(Integer.parseInt(s[2])<=21 || Integer.parseInt(s[2])>=60)
		{
			System.out.println("Invalid age");
			return null;
		}
		System.out.print("Enter Employee Salary:");
		s[3] = sc.next();
		System.out.print("Enter Employee Designation:");
		s[4] = sc.next();
		return s;
	}
	public static void main(String[] args) 
	{
		Cleark[] c =new Cleark[10];
		Manager[] m = new Manager[10];
		Programmer[] p = new Programmer[10];
		int ci=0,mi=0,pi=0;
		while(true)
		{
			System.out.println("\nPress 1-->create\n2-->Display\n3-->Raise salary\n4-->Exit");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:String[] res = reader();
					if(res==null)
						break;
					if(res[4].equalsIgnoreCase("Cleark"))
						c[ci++]=new Cleark(Integer.parseInt(res[0]), Integer.parseInt(res[2]), res[1], res[4], Long.parseLong(res[3]));
					else if(res[4].equalsIgnoreCase("Manager"))
						m[mi++]=new Manager(Integer.parseInt(res[0]), Integer.parseInt(res[2]), res[1], res[4], Long.parseLong(res[3]));
					else if(res[4].equalsIgnoreCase("Programmer"))
						p[pi++]=new Programmer(Integer.parseInt(res[0]), Integer.parseInt(res[2]), res[1], res[4], Long.parseLong(res[3]));
				break;
			case 2:System.out.println("Enter the department you want to see\nPress1-->Programmer\n2-->Clearks\n3-->Manager");
					int ch2 =sc.nextInt();
					switch(ch2)
					{
					case 1:for(int i =0;p[i]!=null;i++)
							{
								p[i].display();
							}
							break;
					case 2:for(int i =0;c[i]!=null;i++)
							{
								c[i].display();
							}
							break;
					case 3:for(int i =0;m[i]!=null;i++)
							{
								m[i].display();
							}
							break;
			
					default:System.out.println("Enter a valid input");
			
					}
					
				break;
			case 3:System.out.println("Enter the department you want to see and increment salary\nPress1-->Programmer\n2-->Clearks\n3-->Manager");
					int ch3 =sc.nextInt();
					int ch4=0;
					switch(ch3)
					{
					case 1:for(int i =0;p[i]!=null;i++)
							{
								System.out.println(i+1+"-->"+p[i].name);
							}
							System.out.println("Enter choice");
							ch4=sc.nextInt();
							p[ch4-1].raiseSalary();
							break;
					case 2:for(int i =0;c[i]!=null;i++)
							{
								System.out.println(i+1+"-->"+c[i].name);
							}
							System.out.println("Enter choice");
							ch4=sc.nextInt();
							c[ch4-1].raiseSalary();
							break;
					case 3:for(int i =0;m[i]!=null;i++)
							{
								System.out.println(i+1+"-->"+m[i].name);
							}
							System.out.println("Enter choice");
							ch4=sc.nextInt();
							m[ch4-1].raiseSalary();
							break;
			
					default:System.out.println("Enter a valid input");
			
					}
				break;
			case 4:
				System.out.println("Thank you!!!!!, Bye");
				System.exit(0);
			default:
				System.out.println("Enter a valid input");
			}
		}
	}

}
