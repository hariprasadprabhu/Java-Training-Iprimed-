
import java.util.Scanner;

class Numbertochar
{
	public static void main(String args[]) 
	{   
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter the degits:");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]+"-"+((char)a[i]));
		}
	} 
 }