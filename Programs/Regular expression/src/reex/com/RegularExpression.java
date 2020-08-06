package reex.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		// Characters
		Pattern p = Pattern.compile(".d");
		Matcher m1 =p.matcher("ad");
		Matcher m2 =p.matcher("af");
		boolean b1 = m1.matches();
		boolean b2 = m2.matches();
		/*System.out.println(b1+"\n"+b2);
		System.out.println(Pattern.compile(".a").matcher("1a").matches());
		System.out.println(Pattern.matches("^ab*", "abbbbb"));//start with a
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[a-z]", "f"));
		System.out.println(Pattern.matches("[abc]+", "abaaabbc"));//only abc onw or  any number of time
		System.out.println(Pattern.matches("[abc]*", ""));// only abc zero or any number of times
		System.out.println(Pattern.matches("[A-Z]", "a"));//case sensitive
		//--------------------------
		System.out.println();
		System.out.println(Pattern.matches("\\d", "1"));//check for a single number
		System.out.println(Pattern.matches("\\D", "A")); // search single char
		System.out.println(Pattern.matches("\\d*", "13213"));//check for a any number
		System.out.println(Pattern.matches("\\D*", "Adsd")); // search any char
		System.out.println(Pattern.matches("[a-z]*\s", "abab "));//spacing
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "abcd"));// 4 char should be there
		System.out.println(Pattern.matches("[91]{2}[0-9]{10}", "919980598756"));*/
		System.out.println(Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+[.][a-zA-Z]*", "a@gmaild.com"));//9 or 1 then any digit 10 times
		
	}
}
