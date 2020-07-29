package hospital.com;

import java.util.Scanner;

interface hospital //abstraction
{
	long incrementSalary(long sal,int perc);
}
class Hospitalc
{
	Hospitalc[] incDeptSal(Hospitalc[] c,int perc) //inheritence
	{
		System.out.println("increase the salary for whole dept");
		return null;
	}
	
}

class Doctors extends Hospitalc implements hospital
{
	String name;
	String email;
	String phone;
	long salary;
	
	public Doctors(String name, String email, String phone, long salary) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	public Doctors()
	{
		
	}
	
	static Doctors fetchDetail(Doctors[] d,String email)
	{
		for(int i=0;d[i]!=null;i++)
		{
			if(email.equalsIgnoreCase(d[i].email))
			{
				return d[i];
			}
		}
		return null;
	}
	@Override
	Doctors[] incDeptSal(Hospitalc[] hc,int perc)//upcasting
	{
		for(int i=0;hc[i]!=null;i++)
		{
			((Doctors)hc[i]).salary=((Doctors)hc[i]).salary+(((Doctors)hc[i]).salary*perc/100);//down casting
		}
		return (Doctors[])hc;
		
	}
	
	
	
	@Override
	public long incrementSalary(long sal,int perc) 
	{
		return (sal*perc/100)+sal;
	}
	
}

class Nurse extends Hospitalc implements  hospital
{
	String name;
	String email;
	String phone;
	long salary;
	
	public Nurse(String name, String email, String phone, long salary) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	
	Nurse()
	{
		
	}
	
	static Nurse fetchDetail(Nurse[] n,String email)
	{
		for(int i=0;n[i]!=null;i++)
		{
			if(email.equalsIgnoreCase(n[i].email))
			{
				return n[i];
			}
		}
		return null;
	}

	@Override
	Nurse[] incDeptSal(Hospitalc[] hc,int perc)//upcasting
	{
		for(int i=0;hc[i]!=null;i++)
		{
			((Nurse)hc[i]).salary=((Nurse)hc[i]).salary+(((Nurse)hc[i]).salary*perc/100);//down casting
		}
		return (Nurse[])hc;
		
	}
	
	@Override
	public long incrementSalary(long sal,int perc) 
	{
		return (sal*perc/100)+sal;
	}
	
}

class SpecialStaff extends Hospitalc implements hospital
{
	String name;
	String email;
	String phone;
	long salary;
	
	public SpecialStaff(String name, String email, String phone, long salary) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	static SpecialStaff fetchDetail(SpecialStaff[] ss,String email)
	{
		for(int i=0;ss[i]!=null;i++)
		{
			if(email.equalsIgnoreCase(ss[i].email))
			{
				return ss[i];
			}
		}
		return null;
	}
	
	SpecialStaff()
	{
		
	}
	
	@Override
	SpecialStaff[] incDeptSal(Hospitalc[] hc,int perc)//upcasting
	{
		for(int i=0;hc[i]!=null;i++)
		{
			((SpecialStaff)hc[i]).salary=((SpecialStaff)hc[i]).salary+(((SpecialStaff)hc[i]).salary*perc/100);//down casting
		}
		return (SpecialStaff[])hc;
		
	}

	@Override
	public long incrementSalary(long sal,int perc) 
	{
		return (sal*perc/100)+sal;
	}
	
}

class Patient extends Hospitalc
{
	String name;
	String email;
	String phone;
	
	public Patient(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	static Patient fetchDetail(Patient[] p,String email)
	{
		for(int i=0;p[i]!=null;i++)
		{
			if(email.equalsIgnoreCase(p[i].email))
			{
				return p[i];
			}
		}
		return null;
	}

	
}



public class Solution {
	
	
	static void Login(String name,String pass) throws UnAuthorizedAccessException
	{
		if(name.equals("admin") && pass.equals("admin"))
			return;
		else
			throw new UnAuthorizedAccessException("Not a valid user");
		
	}
	
	
	public static void main(String[] args) 
	{
		String name;
		String email;
		String phone;
		long salary;
		Doctors[] d = new Doctors[10];
		int di=0;
		Nurse[] n = new Nurse[10];
		int ni=0;
		SpecialStaff[] ss = new SpecialStaff[10];
		int ssi=0;
		Patient[] p = new Patient[10];
		int pi=0;
		Hospitalc[] hc;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------Welcome to our hospital---------------------------------");
		System.out.println("Please login here");
		int flag =0;
		
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
			catch (UnAuthorizedAccessException e)
			{
				System.out.println("Please Check the User name and password");
			}
		}
		
		while(true)
		{
			System.out.println("\nPress\n1-->Doctor\n2-->Nurse\n3-->Special Staff\n4-->Patient\n5-->Increse Salary\n6-->Exit");
			int ch1 = scan.nextInt();
			switch(ch1)
			{
			case 1: System.out.println("Welcome to Doctors section");
					while(true)
					{
					int flag1=0;
					System.out.println("Press\n1-->Add new Doctor\n2-->Fetch doctor Information by EMAIL ID\n3-->Go to main menu");
					int ch2 = scan.nextInt();
					switch(ch2)
					{
					case 1:	System.out.print("Enter the name :");
							name = scan.next();
							System.out.print("Enter the Email :");
							email = scan.next();
							System.out.print("Enter the PhoneNo :");
							phone = scan.next();
							System.out.print("Enter the Salary :");
							salary = scan.nextLong();
							d[di++] = new Doctors(name, email, phone, salary);
							break;
					case 2:	System.out.println("Enter the email addresss of doctor");
							email=scan.next();
							Doctors nd = Doctors.fetchDetail(d, email);
							if(nd==null)
							{
								System.out.println("Sorry there is no doctor found with entered email");
							}
							else
							{
								System.out.println("\nDoctor name : "+nd.name+"\nDoctor Email : "+nd.email+"\nDoctor phon no : "+nd.phone+"\nDoctor Salary : "+nd.salary);
							}
							break;
					case 3: flag1=1;
							break;
					default:System.out.println("Please enter a valid input");
					}
					if(flag1==1)
						break;
					}
					break;
				case 2:
					System.out.println("Welcome to Nurse section");
					while (true) {
						int flag1 = 0;
						
						System.out.println(
								"Press\n1-->Add new Nurse\n2-->Fetch Nurse Information by EMAIL ID\n3-->Go to main menu");
						int ch2 = scan.nextInt();
						switch (ch2) {
						case 1:
							System.out.print("Enter the name :");
							name = scan.next();
							System.out.print("Enter the Email :");
							email = scan.next();
							System.out.print("Enter the PhoneNo :");
							phone = scan.next();
							System.out.print("Enter the Salary :");
							salary = scan.nextLong();
							n[ni++] = new Nurse(name, email, phone, salary);
							break;
						case 2:
							System.out.println("Enter the email addresss of Nurse");
							email = scan.next();
							Nurse nd = Nurse.fetchDetail(n, email);
							if (nd == null) {
								System.out.println("Sorry there is no Nurse found with entered email");
							} else {
								System.out.println("\nNurse name : " + nd.name + "\nNurse Email : " + nd.email
										+ "\nNurse phon no : " + nd.phone + "\nNurse Salary : " + nd.salary);
							}
							break;
						case 3:
							flag1 = 1;
							break;
						default:
							System.out.println("Please enter a valid input");
						}
						if (flag1 == 1)
							break;
					}
					break;
				case 3:
					System.out.println("Welcome to Secial Staffs section");
					while (true) {
						int flag1 = 0;
						
						System.out.println(
								"Press\n1-->Add new Secial Staffs\n2-->Fetch Secial Staffs Information by EMAIL ID\n3-->Go to main menu");
						int ch2 = scan.nextInt();
						switch (ch2) {
						case 1:
							System.out.print("Enter the name :");
							name = scan.next();
							System.out.print("Enter the Email :");
							email = scan.next();
							System.out.print("Enter the PhoneNo :");
							phone = scan.next();
							System.out.print("Enter the Salary :");
							salary = scan.nextLong();
							ss[ssi++] = new SpecialStaff(name, email, phone, salary);
							break;
						case 2:
							System.out.println("Enter the email addresss of Secial Staffs");
							email = scan.next();
							SpecialStaff nd = SpecialStaff.fetchDetail(ss, email);
							if (nd == null) {
								System.out.println("Sorry there is no Secial Staffs found with entered email");
							} else {
								System.out.println("\nSecial Staff name : " + nd.name + "\nSecial Staff Email : " + nd.email
										+ "\nSecial Staff phon no : " + nd.phone + "\nSecial Staff Salary : " + nd.salary);
							}
							break;
						case 3:
							flag1 = 1;
							break;
						default:
							System.out.println("Please enter a valid input");
						}
						if (flag1 == 1)
							break;
					}
					break;
				case 4:
					System.out.println("Welcome to Patient section");
					while (true) {
						int flag1 = 0;
						
						System.out.println(
								"Press\n1-->Add new Patient\n2-->Fetch Patient Information by EMAIL ID\n3-->Go to main menu");
						int ch2 = scan.nextInt();
						switch (ch2) {
						case 1:
							System.out.print("Enter the name :");
							name = scan.next();
							System.out.print("Enter the Email :");
							email = scan.next();
							System.out.print("Enter the PhoneNo :");
							phone = scan.next();
							p[pi++] = new Patient(name, email, phone);
							break;
						case 2:
							System.out.println("Enter the email addresss of Nurse");
							email = scan.next();
							Patient nd = Patient.fetchDetail(p, email);
							if (nd == null) {
								System.out.println("Sorry there is no Patient found with entered email");
							} else {
								System.out.println("\nPatient name : " + nd.name + "\nPatient Email : " + nd.email
										+ "\nPatient phon no : " + nd.phone);
							}
							break;
						case 3:
							flag1 = 1;
							break;
						default:
							System.out.println("Please enter a valid input");
						}
						if (flag1 == 1)
							break;
					}
					break;
			case 5:	int ch3;
					long finalSalary;
					System.out.println("Whom do you want to increase salry press\n1--> Doctor\n2-->Special Staff\n3-->Nurse\n4-->No salary Increment go back to main Menu");
					int ch2=scan.nextInt();
					switch(ch2)
					{
					case 1:	System.out.println("Press 1 if you want to increase salary for whole Doctor Department\nPress 2 if you want to increase salary for individual Doctor");
							ch3 = scan.nextInt();
							Doctors d1 = new Doctors();
							if(ch3==1) {
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								hc = d;
								
								d= d1.incDeptSal(hc, perc);
							}
							else if(ch3==2)
							{
								System.out.println("Enter email of the Doctor");
								email =scan.next();
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								flag=0;
								for(int i=0;d[i]!=null;i++)
								{
									if(d[i].email.equalsIgnoreCase(email))
									{	
										salary=d[i].salary;
										finalSalary=d1.incrementSalary(salary,perc);
										d[i].salary=finalSalary;
										flag=1;
									}
								
								}
								if(flag==0) 
								{
									System.out.println("No Doctor found with given mail Id");
								}
								else
								{
									System.out.println("Salary incremented Goto Doctor section to cross check");
									flag=0;
								}
								
							}
							break;
						case 2:
							SpecialStaff ss1 = new SpecialStaff();
							System.out.println(
									"Press 1 if you want to increase salary for whole Special Staff Department\nPress 2 if you want to increase salary for individual staff");
							ch3 = scan.nextInt();
							if (ch3 == 1) {
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								hc = ss;
								
								ss = ss1.incDeptSal(hc, perc);
							} else if (ch3 == 2) {
								System.out.println("Enter email of the Special Staff");
								email = scan.next();
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								flag = 0;
								for (int i = 0; ss[i] != null; i++) {
									if (ss[i].email.equalsIgnoreCase(email)) {
										salary = ss[i].salary;
										finalSalary=ss1.incrementSalary(salary, perc);
										ss[i].salary=finalSalary;
										flag = 1;
									}

								}
								if (flag == 0) {
									System.out.println("No special staff found with given mail Id");
								} else {
									System.out.println("Salary incremented Goto Special staffs section to cross check");
									flag = 0;
								}

							}
							break;
						case 3:
							Nurse s1 = new Nurse();
							System.out.println(
									"Press 1 if you want to increase salary for whole nurse Department\nPress 2 if you want to increase salary for individual nurse");
							ch3 = scan.nextInt();
							if (ch3 == 1) {
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								hc = n;
								
								n = s1.incDeptSal(hc, perc);
							} else if (ch3 == 2) {
								System.out.println("Enter email of the nurse");
								email = scan.next();
								System.out.println("Enter the percentage of salary do you want to increase");
								int perc = scan.nextInt();
								flag = 0;
								for (int i = 0; n[i] != null; i++) {
									if (n[i].email.equalsIgnoreCase(email)) {
										salary = n[i].salary;
										finalSalary=s1.incrementSalary(salary, perc);
										n[i].salary=finalSalary;
										flag = 1;
									}

								}
								if (flag == 0) {
									System.out.println("No nurse found with given mail Id");
								} else {
									System.out.println("Salary incremented Goto nurse section to cross check");
									flag = 0;
								}

							}
							break;
						case 4:
							break;
						default:
							System.out.println("ENter valid input");
						}
					break;
			case 6: System.out.println("Thank you for using!!, Bye....");
					System.exit(0);
			default:
				System.out.println("enter valid input");
					
					
			}
		}
	}
}
