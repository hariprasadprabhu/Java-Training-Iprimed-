import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought:");
		int pizzas = scan.nextInt();
		System.out.print("Enter the no of puffs bought:");
		int puffs = scan.nextInt();
		System.out.print("Enter the no of cool drinks bought:");
		int coolDrinks = scan.nextInt();
		System.out.println();
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+coolDrinks);
		System.out.println("Total price="+(100*pizzas+20*puffs+10*coolDrinks));
	}
}
