package ageexception.com;

public class Solution {

	public static void main(String[] args) {
		try {
			TestAge.testAge(17);
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
