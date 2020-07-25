package employee.com;

public class Employee {
	int eid;
	String name;
	String email;
	Address a;
	public Employee(int eid, String name, String email, Address a) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.a=a;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", doorNo=" + a.doorNo + ", village=" + a.village + ", city=" + a.city + ", state=" + a.state + "]";
	}
	
}
