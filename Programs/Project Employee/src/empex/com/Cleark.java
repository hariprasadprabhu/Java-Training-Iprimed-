package empex.com;

public class Cleark extends Emp {
	Cleark()
	{
		super();
		salary=8000;
		designation="Cleark";
	}

	@Override
	public void raiseSalary() {
		salary+=2000;
	}
	

}
