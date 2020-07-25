package comp.com;

public class Test {

	public static void main(String[] args) {
		Charger c = new Charger();
		Mobile m =new Mobile(c);
		
		c.charge();
		m.agree();
		m.o.platform();
		
		m=null;
		
		c.charge(); // this will work
		m.agree();
		m.o.platform();
		
		

	}

}
