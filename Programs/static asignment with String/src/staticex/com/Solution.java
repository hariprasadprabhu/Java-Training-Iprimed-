package staticex.com;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Shape s = new Shape(10, 20, 10, 6);
		s.rectangle();
		s.square();
		s.circle();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char[] ch  = new char[str.length()];
		int j=0;
		char ss;
		for(int i=0;i<str.length();i++)
		{
			ss=str.charAt(i);
			if(ss==' ')
			{
				continue;
			}
			else
			{
				ch[j++]=str.charAt(i);
				
			}	
		}
		System.out.println(ch);

	}

}

