package example.com;

import java.util.Scanner;

class Output
{
	public static void main(String args[]) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b || a<0 || b<0)
		{
			System.out.println("Provide valid input");
			System.exit(0);
		}
		int flag=0;
		while(a<=b)
		{
			flag=0;
			int num = a;
			for(int i=2;i<=(a/2);i++)
			{
				if(a%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(num+" ");
			}
			a++;
		}
		
	} 
 }