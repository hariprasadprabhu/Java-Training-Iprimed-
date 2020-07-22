package exam.com;

import java.util.Scanner;

public class Portal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scan.next();
		System.out.print("Enter your age:");
		int age = scan.nextInt();
		System.out.print("Enter your phoneno:");
		long phoneNo = scan.nextLong();
		System.out.print("Enter your qualification:");
		String qualification = scan.next();
		System.out.print("Enter your email id[Please provide valid id, after registering your registration id will be\r\n" + 
				"mailed]:");
		String email = scan.next();
		System.out.print("Enter your noofexperience[if any]:");
		float noOfExperience = scan.nextFloat();
		System.out.println();
		System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days");
		
		

	}

}
