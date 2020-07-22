package calculator.com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ch;
		double a=0.0;
		double b=0.0;
		double res;
		Calculator c = new Calculator();
		while(true)
		{
			System.out.println("***********************Calculator***********************");
			System.out.println("Press\n1 -- Addition\n2 -- Subtraction\n3 -- Multiplication\n4 -- Division\n5 -- Exit\nPlease Enter Your Option:");
			ch = s.nextInt();
			if(ch<=4) {
			System.out.println("Enter the first value");
			a=s.nextDouble();
			System.out.println("Enter the second value");
			b=s.nextDouble();
			}
			switch(ch)
			{
			case 1: res = a= c.add(a, b);
					System.out.println("The Addition result is :"+res);
					break;
			case 2: res = a= c.sub(a, b);
					System.out.println("The Subtraction result is :"+res);
					break;
			case 3: res = a= c.mul(a, b);
					System.out.println("The Multiplication result is :"+res);
					break;
			case 4: if(b==0) {
					System.out.println("Divition Not possible");
					break;
					}
					res = a= c.div(a, b);
					System.out.println("The Division result is :"+res);
					break;
			case 5: System.out.println("Thank you for using,Bye..");
					System.exit(0);
			default:System.out.println("Please Enter the valid option");
					
			}
		}
	}

}
