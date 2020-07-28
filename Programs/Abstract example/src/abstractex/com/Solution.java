package abstractex.com;

public class Solution {

	public static void main(String[] args) {
		// Car c= new Car();  cannot create a object of abstract class
		
		Car c = new Hundai(2020);
		c.speed();
		c.millage();
		c.model();
		c.Fourwheels();
		System.out.println();
		
		c=new BMW(2019);
		c.speed();
		c.millage(); 
		c.model();
		c.Fourwheels();

	}

}
