package empex.com;

public class Manager extends Emp {
	Manager()
	{
		salary=50000;
		designation="Manager";
	}

	@Override
	public void raiseSalary() {
		salary+=10000;
	}
	

}
