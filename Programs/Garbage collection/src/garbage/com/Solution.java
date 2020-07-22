package garbage.com;

public class Solution {

	public static void main(String[] args) {
		/*//First way of garbage collection
		Student s =new Student(101,"Roshan");
		System.out.println(s.name);
		System.out.println(s.roll);
		s=null;
		System.out.println(s.name);
		System.out.println(s.roll);
		*/
		/*//Second way of garbage collection
		Student s1 =new Student(102,"Rajitha");
		Student s2 =new Student(103,"Hari");
		System.out.println(s1.name);
		System.out.println(s2.name);
		s1=s2;//s1 is garbage collected
		System.out.println(s1.name);
		System.out.println(s2.name);
		*/
		/*//Third way of garbage collection
		new Student(101,"Roshan");//here we can exicute it without naming it and placing anywhere in memory
		*/
		//Using from Systrm
		Student s1 =new Student(102,"Rajitha");
		s1=null;
		System.gc();
	}

}


