package fileex.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException
	{
		/*// creation
		File f= new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println("File name is "+f.getName());
		System.out.println("The pas is "+f.getAbsolutePath());
		System.out.println("Length of file "+f.length());
		System.out.println("Is it readable="+f.canRead());
		System.out.println("Is file writable="+f.canWrite());
		*/
		/*
		//creating file and folders
		File f1 = new File("D:\\8CS\\Demo1","abc.txt");
		//f1.mkdir();// creates folder in the specified location
		f1.createNewFile();
		//write something in to file
		 * 
		 */
		
		FileInputStream f =new FileInputStream("D:\\8CS\\Demo1\\abc.txt");
		int i = f.read(); // it alwasy return integer value
		// if i= -1 then reached end of the file
		while(i!=-1)
		{
			System.out.print((char)i);
			i=f.read();//automatically trsverse forwaord
		}
		f.close();
	
		
	}

}
