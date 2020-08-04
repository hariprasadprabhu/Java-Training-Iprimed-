package parseexample.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseEx {
	static {
		System.out.println("Hello");
	}

	public static void main(String[] args) throws ParseException 
	{
		String s ="432";
		int a = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(Integer.valueOf(s));// convert to integer
		
		String ss="21323232323132";
		System.out.println(Long.parseLong(ss));
		
		String sss="21323.232323132";
		System.out.println(Double.parseDouble(sss));
		
		String ssss= "2.12";
		System.out.println(Float.parseFloat(ssss));
		
		String d = "08/02/2020";
		Date  da = new SimpleDateFormat("MM/dd/yyyy").parse(d);
		System.out.println(da);
		char [] str =d.toCharArray();
		System.out.println(str);
	}

}
