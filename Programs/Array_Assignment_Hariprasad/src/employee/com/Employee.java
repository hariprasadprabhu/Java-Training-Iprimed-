package employee.com;

public class Employee {
	int id;
	String name;
	int age;
	public long salary;	
	
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void display(String desig)
	{
		System.out.println("Employee id :"+id+"\nName :"+name+"\nAge :"+age+"\nSalary :"+salary+"\nDesignation :"+desig);
	}

}
class Cleark extends Employee{
	String  desig;
	public Cleark(int id, String name, int age, long salary, String desig) {
		super(id, name, age, salary);
		this.desig = desig;
	}
	void raiseSalary(long amount) {
		salary = salary+amount;
	}
}
class Manger extends Employee{
	String  desig;
	public Manger(int id, String name, int age, long salary, String desig) {
		super(id, name, age, salary);
		this.desig = desig;
	}
	void raiseSalary(long amount) {
		salary = salary+amount;
	}
}
class Tester extends Employee{
	String  desig;
	public Tester(int id, String name, int age, long salary, String desig) {
		super(id, name, age, salary);
		this.desig = desig;
	}

	void raiseSalary(long amount) {
		salary = salary+amount;
	}
}