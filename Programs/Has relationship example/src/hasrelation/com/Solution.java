package hasrelation.com;

class A
{
	void demo()
	{
		System.out.println("AAA class");
	}
}

class B extends A
{
	void demo()
	{
	System.out.println("BB class");
	}
}

public class Solution {

	public static void main(String[] args) {
		B b =new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
	}

}
