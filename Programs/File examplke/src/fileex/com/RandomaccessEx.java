package fileex.com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomaccessEx {

	static String path = "abc.txt";
	static String path1 = "abcCopy.txt";
	public static void main(String[] args) throws IOException
	{
		String str = new String(readd(path,0,20));// we can the starting index here
		System.out.println(str);
		writee(path1,"hello i am writing here",0);// write to new file abcCopy
		
	}
			
	static byte[] readd(String path,int pos,int size) throws IOException
	{
		RandomAccessFile ra =new RandomAccessFile(path, "r");
		ra.seek(pos);
		byte[] b = new byte[size];//it will store the each byte of char in the  byet arraye 		
		ra.read(b);
		ra.close();
		return b;
	}
	
	static void writee(String path1,String mesg,int pos) throws IOException
	{
		RandomAccessFile ra =new RandomAccessFile(path1, "rw");// read write
		ra.seek(pos);//start writing from given position
		ra.writeBytes(mesg);
		ra.close();
	}

}
