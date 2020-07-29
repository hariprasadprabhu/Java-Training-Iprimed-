package Ioexample.com;

import java.io.IOException;

public class Solution {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello"); // output
		
		System.err.println("Hello");//error
		
		int a = System.in.read();  //input
		System.out.println((char)a);
	}

}
