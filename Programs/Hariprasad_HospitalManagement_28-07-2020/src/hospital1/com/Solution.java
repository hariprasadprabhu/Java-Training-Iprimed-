package hospital1.com;
import java.util.Scanner;
interface hospital //for abstraction
{
	long incrementPersonalSalary(long sal,float perc);
}
class Hospitalc //for inheritence 
{
	String name,email,phone;
	long salary;
	public Hospitalc(String name, String email, String phone, long salary) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	public Hospitalc() {
	}
	Hospitalc[] incDeptSal(Hospitalc[] c,float perc) 
	{
		System.out.println("increase the salary for whole dept");
		return null;
	}		
}
class Doctors extends Hospitalc implements hospital
{
	public Doctors(String name, String email, String phone, long salary) {
		super(name, email, phone, salary);
	}
	public Doctors() {
		super();
	}
	@Override
	public long incrementPersonalSalary(long sal, float perc) {
		return (long) ((sal*perc/100)+sal);
	}
	@Override
	Hospitalc[] incDeptSal(Hospitalc[] c,float perc) 
	{
		for(int i=0;c[i]!=null;i++)
		{
			c[i].salary=(long) ((c[i].salary*perc/100)+c[i].salary);
		}
		return c;	
	}	
}

class Nurse extends Hospitalc implements  hospital
{
	public Nurse(String name, String email, String phone, long salary) {
		super(name, email, phone, salary);
	}
	public Nurse() {
	}
	@Override
	public long incrementPersonalSalary(long sal, float perc) {
		return (long) ((sal*perc/100)+sal);
	}
	@Override
	Hospitalc[] incDeptSal(Hospitalc[] c,float perc) 
	{
		for(int i=0;c[i]!=null;i++)
		{
			c[i].salary=(long) ((c[i].salary*perc/100)+c[i].salary);
		}
		return c;	
	}	
}
class SpecialStaff extends Hospitalc implements hospital
{
	public SpecialStaff(String name, String email, String phone, long salary) {
		super(name, email, phone, salary);
	}
	public SpecialStaff() { 
	}
	@Override
	public long incrementPersonalSalary(long sal, float perc) {
		return (long) ((sal*perc/100)+sal);
	}
	@Override
	Hospitalc[] incDeptSal(Hospitalc[] c,float perc) 
	{
		for(int i=0;c[i]!=null;i++)
		{
			c[i].salary=(long) ((c[i].salary*perc/100)+c[i].salary);
		}
		return c;	
	}
}
class Patient extends Hospitalc
{
	public Patient(String name, String email, String phone, long salary) {
		super(name, email, phone, salary);
	}	
}

public class Solution {
	
	static Scanner scan = new Scanner(System.in);
	static void Login(String name,String pass) throws UnAuthorizedAccessException
	{
		if(name.equals("admin") && pass.equals("admin"))
			return;
		else
			throw new UnAuthorizedAccessException("Not a valid user");	
	}
	static String[] readAll(int ddd)
	{
		System.out.print("Enter the name :");
		String name = scan.next();
		System.out.print("Enter the Email :");
		String email = scan.next();
		System.out.print("Enter the PhoneNo :");
		String phone = scan.next();
		String salary="";
		if(ddd==1) {
		System.out.print("Enter the Salary :");
		salary = scan.next();
		}
		String[] a = new String[4];
		a[0]=name;
		a[1]=salary;
		a[2]=phone;
		a[3]=email;
		return a;
	}
	static void fetchInfo(Hospitalc[] h)
	{
		System.out.println("Enter the number whose information you want to retieve");
		int max=0;
		for(int i=0;h[i]!=null;i++)
		{
			System.out.println(i+1+"-->"+h[i].name);
			max++;
		}
		int k = scan.nextInt();
		if(max<=k) {
			if(h[k-1].salary!=0)
				System.out.println("Name: "+h[k-1].name+"\nEmail: "+h[k-1].email+"\nPhone: "+h[k-1].phone+"\nSalary: "+h[k-1].salary);
			else
				System.out.println("Name: "+h[k-1].name+"\nEmail: "+h[k-1].email+"\nPhone: "+h[k-1].phone);	
		}else {
			System.out.println("Sorry no person at mentioned number");
		}
	}
	
	static int searchByName(Hospitalc[] h, String name)
	{
		for(int i=0;h[i]!=null;i++)
		{
			if(h[i].name.equalsIgnoreCase(name))
				return i;
		}
		return 0;
	}
	static int askWhom()
	{
		System.out.println("\npress\n1-->increment the salary of indivitual by searching name\n2-->increment whole department salary");
		return scan.nextInt();
	}
	static String askName()
	{
		System.out.println("Enter the name to whome you want to increment salary");
		return scan.next();
	}
	static float askPercentage()
	{
		System.out.println("Enter percentage to increase");
		return scan.nextFloat();
	}
	
	public static void main(String[] args) 
	{
		int di=0,ni=0,ssi=0,pi=0,flag1=0;
		Doctors[] d = new Doctors[10];// array for holding Doctor objects
		Nurse[] n = new Nurse[10];
		SpecialStaff[] ss = new SpecialStaff[10];
		Patient[] p = new Patient[10];
		System.out.println("--------------------------Welcome to our hospital---------------------------------\nPlease login here");
		while(true)
		{
			System.out.print("Enter User name: ");
			String username = scan.nextLine();
			System.out.print("Enter the password: ");
			String pass = scan.nextLine();
			try 
			{
				Login(username,pass);
				System.out.println("Thank you for your patience You are succesfully Logged in");
				break;
			} 
			catch (UnAuthorizedAccessException e) // Created new exception
			{
				System.out.println("Please Check the User name and password");
			}
		}
		while(true)
		{
			System.out.println("\nPress\n1-->Doctor\n2-->Nurse\n3-->Special Staff\n4-->Patient\n5-->Exit");
			int ch1 = scan.nextInt();
			switch(ch1)
			{
			case 1:	System.out.println("Welcome to Doctors section");
					flag1=0;
					while(true)
					{
						System.out.println("Press\n1-->Add new Doctor\n2-->Fetch doctor Information by name\n3-->Increment salary\n4-->Go to main menu");
						int ch2 = scan.nextInt();
						switch(ch2)
						{
						case 1:String[] aa=readAll(1);
								d[di++]=new Doctors(aa[0], aa[3], aa[2], Long.parseLong(aa[1]));
								break;
						case 2:fetchInfo(d);
								break;
						case 4:flag1=1;
								break;
						case 3:int res3=askWhom();
							switch(res3)
							{
							case 1:int res= searchByName(d, askName());
									if(res!=1) {
										d[res].salary=new Doctors().incrementPersonalSalary(d[res].salary, askPercentage());
									}
									else
										System.out.println("No doctor with the entered name");
								break;
							case 2:d=(Doctors[]) new Doctors().incDeptSal(d,askPercentage());// down casting
								break;
							default:
								System.out.println("Enter a valid CHOICE");
							}
							break;
						default:System.out.println("Enter a valid CHOICE");
						}
						if(flag1==1)
							break;
					}
					break;
			case 2:System.out.println("Welcome to Nurse section");
					flag1=0;
						while(true)
						{
							System.out.println("Press\n1-->Add new Nurse\n2-->Fetch Nurse Information by name\n3-->Increment salary\n4-->Go to main menu");
							int ch2 = scan.nextInt();
							switch(ch2)
							{
							case 1:String[] aa=readAll(1);
								n[ni++]=new Nurse(aa[0], aa[3], aa[2], Long.parseLong(aa[1]));
								break;
							case 2:fetchInfo(n);// UP CASTING
								break;
							case 4:flag1=1;
								break;
							case 3:switch(askWhom())
								{
								case 1:int res= searchByName(n, askName());
									if(res!=1) {
										n[res].salary=new Nurse().incrementPersonalSalary(n[res].salary, askPercentage());
									}
									else
										System.out.println("No doctor with the entered name");
									break;
								case 2:n=(Nurse[]) new Nurse().incDeptSal(n,askPercentage());// down casting
									break;
								default:
									System.out.println("Enter a valid CHOICE");
								}
								break;
							default:System.out.println("Enter a valid CHOICE");
							}
							if(flag1==1)
								break;
						}
						break;
			case 3:System.out.println("Welcome to Special staffs section");
						flag1=0;
						while(true)
						{
							System.out.println("Press\n1-->Add new Special staffs\n2-->Fetch Special staffs Information by name \n3-->Increment salary\n4-->Go to main menu");
							int ch2 = scan.nextInt();
							switch(ch2)
							{
							case 1:String[] aa=readAll(1);
								ss[ssi++]=new SpecialStaff(aa[0], aa[3], aa[2], Long.parseLong(aa[1]));
								break;
							case 2:fetchInfo(ss);
								break;
							case 4:flag1=1;
								break;
							case 3:switch(askWhom())
							{
							case 1:int res= searchByName(ss, askName());
								if(res!=1) {
									ss[res].salary=new SpecialStaff().incrementPersonalSalary(ss[res].salary, askPercentage());
								}
								else
									System.out.println("No doctor with the entered name");
								break;
							case 2:ss=(SpecialStaff[]) new SpecialStaff().incDeptSal(ss,askPercentage());// down casting
								break;
							default:
								System.out.println("Enter a valid CHOICE");
							}
							break;
							default:System.out.println("Enter a valid CHOICE");
							}
							if(flag1==1)
							break;
						}
						break;
			case 4:System.out.println("Welcome to Patient section");
						flag1=0;
						while(true)
						{
							System.out.println("Press\n1-->Add new Patient\n2-->Fetch Patient Information by name \n3-->Go to main menu");
							int ch2 = scan.nextInt();
							switch(ch2)
							{
							case 1:String[] aa=readAll(0);
								p[pi++]=new Patient(aa[0], aa[3], aa[2],0);
								break;
							case 2:fetchInfo(p);
								break;
							case 3:flag1=1;
								break;
							default:System.out.println("Enter a valid CHOICE");
							}
							if(flag1==1)
								break;
						}
						break;
			case 5:System.out.println("Thank you for using Bye");
					System.exit(0);
			default:
					System.out.println("Enter a valid CHOICE");
			}
		}
	}
}
