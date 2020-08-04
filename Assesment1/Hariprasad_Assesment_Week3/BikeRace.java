
import java.util.Scanner;

public class BikeRace {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the distance travelled");
		String num = s.next();
		long oProd=1;
		long eProd=1;
		int pos=1;
		for(int i=0;i<num.length();i++)
		{
			if((i+1)%2==0)
			{
				String n =Character.toString(num.charAt(i));
				eProd*=Long.parseLong(n);
			}
			else
			{
				String n =Character.toString(num.charAt(i));
				oProd*=Long.parseLong(n);
			}
			pos++;
		}
		if(eProd!=oProd)
		{
			long res = eProd>oProd?eProd:oProd;
			System.out.println("Your bonus points is "+res);	
		}
		else
			System.out.println("Your bonus points is "+eProd*2);
	}

}
