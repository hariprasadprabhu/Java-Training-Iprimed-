
import java.util.Scanner;

class PlindromeGame
{
	public static void main(String args[]) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long num=0,temp,tempNum=0;
		long reversed = 0;
		try
		{
			num=sc.nextLong();
			tempNum=num;
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		if(num<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		while(num != 0) {
            temp = num % 10;
            reversed = (reversed*10)+temp;
            num = num / 10;
        }
		
		if(tempNum == reversed)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	} 
 }