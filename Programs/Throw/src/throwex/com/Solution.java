package throwex.com;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		int b=0;
		int c;
		if (b>0)
			System.out.println("result =:"+(a/b));
		else
			throw new ArithmeticException("Not valid");
		*/
		
		vote(18);
		
		

	}
	static void vote(int age)
	{
		if(age>18)
			System.out.println("Youi can vote");
		else
			throw new ArithmeticException("cant vote");
	}

}
