
import java.util.InputMismatchException;
import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		float r=0;;
		long sal=0;
		try {
			System.out.println("Enter the salary:");
			sal=s.nextLong();
			System.out.println("Enter the Performance appraisal rating");
			r = s.nextFloat();
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		if(sal<=0 || r<1 || r>5)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		if(r>=1 && r<=3)
			System.out.println(sal+(sal*10/100));
		else if(r>3 && r<=4)
			System.out.println(sal+(sal*25/100));
		else if(r>4 && r<=5)
			System.out.println(sal+(sal*30/100));

	}

}
