package comp.com;

public class Mobile {

	Charger c;
	public Mobile(Charger c) {
	this.c = c;
	}
	Os o = new Os();
	
	void agree()
	{
		System.out.println(c.volts+" ");
	}
}
