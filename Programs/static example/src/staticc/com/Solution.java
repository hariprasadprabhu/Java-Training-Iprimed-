package staticc.com;

public class Solution {

	public static void main(String[] args) {
		College c =new College("MITE", 300);
		c.disp();
		College c1 = new College("Alvas", 400);
		c.disp();
		c.noOfClass();
		System.out.println(College.classrooms);// we can access the static variable directly with the class name
		
		
		Solution s =new Solution();
		s.round();

	}
	void round()
	{
		System.out.println(College.classrooms);
	}
	static
	{
		System.out.println("static block 1");
		System.out.println(College.classrooms);
	}
	static
	{
		System.out.println("static block 2");
	}

}
