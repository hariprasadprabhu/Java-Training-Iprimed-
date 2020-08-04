package reex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter regex patter");
		Pattern p =Pattern.compile(s.nextLine());
		System.out.println("User Input");
		Matcher m = p.matcher(s.nextLine());
		boolean b =false;
		while(m.find())
		{
			System.out.println("found the text "+m.group());
			System.out.println("Start index:"+m.start());
			System.out.println("Ending index:"+m.end());
			
			b=true;
		}
		if(b==false)
			System.out.println("match not found");
		
	}

}
