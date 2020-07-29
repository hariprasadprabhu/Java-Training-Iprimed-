package fileex.com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereaderex {

	public static void main(String[] args) throws IOException {
		FileReader f1 =new FileReader("D:/8CS/Demo1/abc.txt");
		
		FileWriter f2 = new FileWriter("D:/8CS/Demo1/abc2.txt");

		int i=0;
		while(i!=-1)
		{
			
			
			i=f1.read();
			System.out.print((char)i);
			f2.write(i);
		}
		f1.close();
		f2.close();
	System.out.println("File copied!!");

	}

}
