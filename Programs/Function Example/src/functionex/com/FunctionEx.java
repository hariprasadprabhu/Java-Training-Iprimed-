package functionex.com;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		Function f=(n)->//to perform some operation and return it 
		{
			n=10;
			return n;
		};
		System.out.println(f.apply(100));
	}

}
