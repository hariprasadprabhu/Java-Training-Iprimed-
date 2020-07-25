package employee.com;

public class Demo {

	public static void main(String[] args) {
		Address a =new Address(3, "Anjaru", "Hiriadka", 576113, "Karnataka");
		Employee e = new Employee(23, "Hari", "Hari@123",a);
		System.out.println(	e.toString());

	}

}
