package inbuilt.com;
import java.time.*;
import java.lang.Math;
public class Solution {

	public static void main(String[] args) {
		//Date and time
		System.out.println(LocalTime.now());
		LocalTime t= LocalTime.now();
		System.out.println(t.getMinute());
		System.out.println(t.getHour());
		LocalTime t1 = t.of(12, 59);
		System.out.println(t1);
		
	}
}