package predicateex.com;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		Predicate p = (n) -> {
			return true;//have to specify conditions here
		};
		System.out.println(p.test(false));//used to validate some function return boolean
	}

}
