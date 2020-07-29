package fileex.com;

import java.io.Console;


public class ConsoleEx {

	public static void main(String[] args) {
		//do it in command promt
		Console con = System.console();
		
		System.out.println("Enter the name");
		
		String  s = con.readLine();
		System.out.println("Enter password");
		char[] pass =con.readPassword();
		String s1=new String(pass);
		if(s1.equals("admin") && s.equals("admin"))
			System.out.println("Successfull");
		else
			System.out.println("wrong credential");

	}

}
