package student.com;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(10, "Hariprasad", "male", "20-05-1998", "10th");
		s1.disp();
		System.out.println();
		Student s2 = new Student(s1);
		s2.disp();
		//Student s2 = new Student(); we cannot call default constactor after creating parameterized constructor
	}

}
