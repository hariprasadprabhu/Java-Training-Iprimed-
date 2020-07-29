package fileex.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstremEx {

	public static void main(String[] args) throws IOException {
		FileInputStream f1 =new FileInputStream("D:/8CS/Demo1/abc.txt");
		
		FileOutputStream f2 = new FileOutputStream("D:/8CS/Demo1/abc2.txt");

		int i=0;
		while(i!=-1)
		{
			f2.write(i);
			i=f1.read();
			
		}
		f1.close();
		f2.close();
	System.out.println("File copied");
	}

}
