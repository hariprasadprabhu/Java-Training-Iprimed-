package formating.com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeEx {

	public static void main(String[] args) {
		
		//using SimpleDateFormate examples
		java.util.Date date =Calendar.getInstance().getTime();
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateformat.format(date));
		
		//---------------------------------------
		
		Date d1 = new Date();
		dateformat= new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(dateformat.format(d1));

		//----------------
		dateformat= new SimpleDateFormat("E, dd MMMM yyyy");
		System.out.println(dateformat.format(d1));
	}

}
