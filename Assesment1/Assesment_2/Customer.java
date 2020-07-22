import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scan.nextLine();
		System.out.print("Enter age:");
		int age = scan.nextInt();
		System.out.print("Enter gender:");
		String gender = scan.next();
		System.out.print("Hailing from:");
		String hailingFrom = scan.next();
		System.out.print("Welcome, "+name+"!");
		

	}

}
