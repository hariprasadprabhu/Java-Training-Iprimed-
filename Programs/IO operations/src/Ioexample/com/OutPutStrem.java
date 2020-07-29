package Ioexample.com;
import java.io.*;


public class OutPutStrem {

	public static void main(String[] args) throws IOException 
	{
		/*System.out.println("hello boys");
		PrintWriter writer =new PrintWriter(System.out,true);//see tha documentation of PrintWriter 
		// this is same as we write System.out.println
		// here giving the reference of System.out to writer
		int i =10;
		String i1 = "Hello";
		double i2 = 22.32;
		
		writer.append('a');
		writer.append('b');
		writer.flush();
		writer.append("Hello there");

		writer.flush();// If the stream has saved any characters from the various write() methods in a buffer, write them immediately to their intended destination. 
		
		writer.println(i);
		writer.println(i1);
		writer.println(i2);*/
		//------------------------------------------------------------------------------------------------------------------------------------------
		
		InputStreamReader istr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(istr);
		
		System.out.println("Enter a number");
		String int1 = br.readLine();
		int a = Integer.parseInt(int1);
		
		System.out.println("Enter a string");
		String s1 = br.readLine();
		int b =Integer.parseInt(s1);
		System.out.println(a);
		System.out.println(b);
		br.close();
	}

}
