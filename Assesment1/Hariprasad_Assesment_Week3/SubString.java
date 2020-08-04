
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(str.substring(a,b));
	}
}
