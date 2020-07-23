package exception.com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*//numberFormathException
		int a = scan.nextInt();
		String a1 ="hari";
		*/
		
		/*//DevideByZerException
		Scanner scan = new Scanner(System.in);
		try{System.out.println("Enter one element");
		int abc = Integer.parseInt(a1);
		System.out.println("Enter seconfd element");
		int b = scan.nextInt();
		double res = a/b;
		System.out.println("result is : "+res);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("This will exicute");
		
		
		
		//Correct way of writing try & about multiple catch blocks
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one element");
		int a =scan.nextInt();
		System.out.println("Enter seconfd element");
		int b = scan.nextInt();
		try {
		double res = a/b;
		System.out.println("result is : "+res);
		}
		catch (ArithmeticException e) {
			System.out.println(a/(b+1));
		}
		catch (NullPointerException e) {
			System.out.println("null pointer exception");
		}
		catch (Exception e) {// should be written as a last catch block
			System.out.println("Has somne exception");
		}
		System.out.println("This will exicute");
		
		*/
		
		
		
		try {
			try
			{
				double res = 100/0;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			try 
			{
				int[] ab=new int[10];
				ab[11]=10;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {// should be written as a last catch block
			System.out.println("Has somne exception");
		}
		System.out.println("rest will exicute");
		
	}

}
