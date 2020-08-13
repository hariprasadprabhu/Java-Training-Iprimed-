package empex.com;

public class Programmer extends Emp {
	Programmer()
	{
		salary=35000;
		designation="Programmer";
	}

	@Override
	public void raiseSalary() {
		salary+=8000;
	}
	

}
