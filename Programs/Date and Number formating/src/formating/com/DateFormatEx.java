package formating.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {
	static void printCurrency(Locale l)
	{
		Date d = new Date();
		 DateFormat formatter=DateFormat.getDateInstance(0, l);
		 String datef=formatter.format(d); 
		 System.out.println(datef);  
	}


	public static void main(String[] args) {
		
		// format according their contry convention
		printCurrency(Locale.UK);  
	    printCurrency(Locale.US); 
	    printCurrency(Locale.FRANCE);  

	}

}
