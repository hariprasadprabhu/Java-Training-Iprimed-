package employee.com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Manger[] m = new Manger[10];
		Cleark[] c = new Cleark[10];
		Tester[] t = new Tester[10];
		int mi=0,ci=0,ti=0;
		long amt;
		int flag=0;
		int id;
		int resT =0;
		int resC = 0;
		int resM = 0;
		String name;
		int age;
		long salary;
		String  desig;
		int ch;
		int subCh;
		while(true) {
			System.out.println("Press\n1-->Insert Employees\n2-->Display Details\n3-->Raise Salary\n4-->exit");
			ch = s.nextInt();
			switch(ch)
			{
			case 1: while(true)
					{
						System.out.println("\nPress\n1-->Add New employee\n2-->Go back to main Menu");
						subCh = s.nextInt();
						switch(subCh) {
						case 1:resT=0;
							   resC=0;
							   resM=0;
							   System.out.print("Enter Id : ");
							   id= s.nextInt();
							   System.out.print("Enter Name : ");
							   name = s.next();
							   System.out.print("Enter Age : ");
							   age = s.nextInt();
							   if(age<21 || age>60)
							   {
								   System.out.println("Sorry your age should not match our conditions (21 > age < 60) Thank for visiting!!!");
								   break;
							   }
							   System.out.print("Enter Salary : ");
							   salary = s.nextLong();
							   System.out.print("Enter Designation \nPlease type T for Tester\nM for manager\nC for cleark : ");
							   desig = s.next();
							   if(desig.equals("T") || desig.equals("t"))
								   t[ti++] = new Tester(id, name, age, salary, "Tester");
							   else if(desig.equals("M") || desig.equals("m"))
								   m[mi++] = new Manger(id, name, age, salary, "Manager");
							   else if(desig.equals("C") || desig.equals("c"))
								   c[ci++]= new Cleark(id, name, age, salary, "Cleark");
							   else
								   System.out.println("Not done");
							break;
						case 2:
								for(int i = 0;t[i]!=null;i++)
									resT++;
								for(int i = 0;c[i]!=null;i++)
									resC++;
								for(int i = 0;m[i]!=null;i++)
									++resM;
								System.out.println("\nWe have \nMangers :"+resM+"\nClearks :"+resC+"\nTesters :"+resT+"\nTotally we have "+ (resT+resC+resM)+" Employees");
								System.out.println();
								flag=1;
								break;
						default:
							System.out.println("Please enter valid number");
						}
						
						if(flag == 1) {
							flag=0;
							break;
						}
					}
				break;
			case 2:
				System.out.println("The Details of Employee as Given below");
				if(t[0]==null)
					System.out.println("There are no testers to display");
				else 
				{
					System.out.println("\nInformation of Testers");
					for(int i = 0;t[i]!=null;i++)
					{
						System.out.println("Id :"+t[i].id+"\nName: "+t[i].name+"\nAge :"+t[i].age+"\nSalary :"+t[i].salary);
						System.out.println();
					}
				}
				if(c[0]==null)
					System.out.println("There are no clearks to display");
				else 
				{
					System.out.println("\nInformation of Clearks");
					for(int i = 0;c[i]!=null;i++)
					{
						System.out.println("Id :"+c[i].id+"\nName: "+c[i].name+"\nAge :"+c[i].age+"\nSalary :"+c[i].salary);
						System.out.println();
					}
				}
				if(m[0]==null)
					System.out.println("There are no Manager to display");
				else 
				{
					System.out.println("\nInformation of Managers");
					for(int i = 0;m[i]!=null;i++)
					{
						System.out.println("Id :"+m[i].id+"\nName: "+m[i].name+"\nAge :"+m[i].age+"\nSalary :"+m[i].salary);
						System.out.println();
					}
				}
				System.out.println();
				break;
			case 3: System.out.print("Please Enter Which department salary Do you want to raise (Please type T for Tester\nM for manager\nC for cleark : ");
					desig = s.next();
					if(desig.equals("T") || desig.equals("t"))
					{
						System.out.println("Enter the amount you want to rise");
						amt = s.nextLong();
						for(int i = 0;t[i]!=null;i++)
						{
							t[i].raiseSalary(amt);
						}
						System.out.println("Thank you The salary is raised for all Tester");
					}
					else if(desig.equals("M") || desig.equals("m"))
					{
						System.out.println("Enter the amount you want to rise");
						amt = s.nextLong();
						for(int i = 0;m[i]!=null;i++)
						{
							m[i].raiseSalary(amt);
						}
						System.out.println("Thank you The salary is raised for all Managers");
					}
					else if(desig.equals("C") || desig.equals("c"))
					{
						System.out.println("Enter the amount you want to rise");
						amt = s.nextLong();
						for(int i = 0;c[i]!=null;i++)
						{
							c[i].raiseSalary(amt);
						}
						System.out.println("Thank you The salary is raised for all Clearks");
					}
					else
						   System.out.println("You entered wrong character");
			break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please enter valid number");
			}
		}

	}

}
