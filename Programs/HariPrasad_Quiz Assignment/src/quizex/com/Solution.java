package quizex.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution extends Thread {
	static int res=0;

	public static void main(String[] args) throws InterruptedException  {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Quizz Please register before Starting exam");
		int id;
		String name=null;
		int age;
		String email=null;
		String qualification;
		boolean flag=true;
		while(flag)
		{
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Id : ");
				id =sc.nextInt();
				System.out.print("Enter name : ");
				name=sc.next();
				while(true) 
				{
					System.out.println("Enter Age : ");
					age=sc.nextInt();
					if(age<18 || age>30)
					{
						System.out.println("Sorry you are too young or too old to try this test enter it properly");
					}
					else
						break;
						
				}
				System.out.println("Enter email : ");
				email = sc.next();
				while(!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+[.][a-zA-Z]*", email))
				{
					System.out.println("Sorry Email not regognized Enter a proper email : ");
					email = sc.next();
					
				}
				
				System.out.println("Enter Qualification : ");
				qualification=sc.next();
				flag=false;
			}
			catch (InputMismatchException e) {
				System.out.println("Please enter a valid format");
			}
			
			
		}
		System.out.println("Please Login with entered credentials before Starting the test");
		flag=true;
		while(flag)
		{
			System.out.println("Enter User name : ");
			String uname=s.next();
			System.out.println("Enter password : ");
			String pass=s.next();
			if(uname.equalsIgnoreCase(name) && pass.equals(email))
			{
				System.out.println("Now you can start the Test");
				flag=false;
			}
			else
				System.out.println("Sorry Wrong user name or password");
		}
		Thread t1 = new Thread()
		 {
			synchronized public void run()
			{
				try {
					File file=new File("c.txt");
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					int i =1,marks=0;
					String line;
					while(true) {
					while((line=br.readLine())!=null)
					{
						System.out.println(i+++") "+line);
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						String actualAns=br.readLine();
						String ans=s.next();
						if(ans.equalsIgnoreCase(actualAns))
							marks+=1;
					}
					if(i==11)
					{
						if(marks>=7)
						{
							res+=marks;
							System.out.println("Congradualations You cleared the test");
							break;
						}
						else
						{
							System.out.println("Sorry Please re try the test and complete this section");
							i=1;
							fr=new FileReader(file);
							br=new BufferedReader(fr);
						}
					}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread()
		 {
			synchronized public void run()
			{
				try {
					File file=new File("cpp.txt");
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					int i =1,marks=0;
					String line;
					while(true) {
					while((line=br.readLine())!=null)
					{
						System.out.println(i+++") "+line);
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						String actualAns=br.readLine();
						String ans=s.next();
						if(ans.equalsIgnoreCase(actualAns))
							marks+=1;
					}
					if(i==11)
					{
						if(marks>=7)
						{
							res+=marks;
							System.out.println("Congradualations You cleared the test");
							break;
						}
						else
						{
							System.out.println("Sorry Please re try the test and complete this section");
							i=1;
							fr=new FileReader(file);
							br=new BufferedReader(fr);
						}
					}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread t3 = new Thread()
		 {
			synchronized public void run()
			{
				try {
					File file=new File("java.txt");
					FileReader fr=new FileReader(file);
					BufferedReader br=new BufferedReader(fr);
					int i =1,marks=0;
					String line;
					while(true) {
					while((line=br.readLine())!=null)
					{
						System.out.println(i+++") "+line);
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						System.out.println(br.readLine());
						String actualAns=br.readLine();
						String ans=s.next();
						if(ans.equalsIgnoreCase(actualAns))
							marks+=1;
					}
					if(i==11)
					{
						if(marks>=7)
						{
							res+=marks;
							System.out.println("Congradualations You cleared the test");
							break;
						}
						else
						{
							System.out.println("Sorry Please re try the test and complete this section");
							i=1;
							fr=new FileReader(file);
							br=new BufferedReader(fr);
						}
					}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		System.out.println("Please complete the C programmin test");
		t1.start();
		t1.join();
		System.out.println("Please complete the C++ programmin test");
		t2.start();
		t2.join();
		System.out.println("Please complete the java programmin test");
		t3.start();
		t3.join();
		float fRes=(res/3)*100;
		if(fRes>=90)
			System.out.println("Best");
		else if(fRes>=80)
			System.out.println("Better");
		else if(fRes>=70)
			System.out.println("Good");
		else if(fRes>=60)
			System.out.println("still need to improve");
		else if(fRes>=50)
			System.out.println("not satified");
		else
			System.out.println("Not fit try once again");
	}
}
