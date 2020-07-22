package exception.com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{System.out.println("Enter one element");
		int a = scan.nextInt();
		System.out.println("Enter seconfd element");
		int b = scan.nextInt();
		double res = a/b;
		System.out.println("result is : "+res);
	}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("This will exicute");
	}

}
