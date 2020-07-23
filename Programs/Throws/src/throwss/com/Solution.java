package throwss.com;

import java.io.IOException;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colleg c =new Colleg(); 
		
		
		try {  // third way
			c.doo();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		// fourth way to add throws in front of main methos()
	}

}
