package interfaceex.com;

public class Solution {

	public static void main(String[] args) {
		Animal a;
		a=new Lion();
		a.eat();
		a.sleep();
		a.soud();
		Animal.hunt();
		
		System.out.println();
		
		a= new Cat();
		a.eat();
		a.sleep();
		a.soud();
		Animal.hunt();
		
		System.out.println();

		a=new VegDino();
		a.eat();
		a.sleep();
		a.soud();
		Animal.hunt();
		((VegDino) a).lastSeen();
		
		System.out.println("_________________________________________________");
		
		wildAnimal wa;
		wa=new example();
		wa.eat();
		wa.sleep();
		System.out.println();
		Dog wb=new example();
		wb.eat();
		((wildAnimal) wb).sleep();
		
		
		
	}

}
