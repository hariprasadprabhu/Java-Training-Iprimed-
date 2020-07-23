package bankapp.com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
		TestingPage ts = new TestingPage();
		Scanner sc=new Scanner(System.in);
		int ch;
		double amount;
		System.out.println("-------------------Welcome to Bank-------------------");	
		while(true)
		{
			System.out.println("press\n1-->Credit\n2-->Withdraw\n3-->Check Balance\n4-->Exit");
			ch=sc.nextInt();
			switch(ch)
			{
		 		case 1: System.out.println("Enter the amount you want to credit");
		 				amount = sc.nextDouble();
		 				ts.addBalance(amount);
		 				break;
		 				
		 		case 2: System.out.println("Enter the amount you want to withdraw");
		 				amount = sc.nextDouble();
		 				
		 				try {
		 						ts.withdraw(amount);
		 					} 
		 				catch (NotEnoughMoney e) 
		 					{
		 						System.out.println("Sorry You dont have enough amount");
		 					}
		 				break;
		 				
		 		case 3: ts.checkbalance();
		 				break;
		 				
		 		case 4: System.out.println("Thank you For using our bank, Bye.");
		 				System.exit(0);
		 				break;
		 				
		 		default:
		 				System.out.println("Please enter valid number");
			}
		}

	}

}
