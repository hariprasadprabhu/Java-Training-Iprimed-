package formating.com;

import java.text.NumberFormat;
import java.util.Locale;

public class numberformating {
	
	static void printCurrency(Locale locale)
	{
		 double dbl=10500.3245;  
		 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
		 String currency=formatter.format(dbl);  
		 System.out.println(currency+" for the locale "+locale);  
	}

	public static void main(String[] args) 		
	{
		//used to print the currrency symbols
		//gives the mentioned country formaat
		
		printCurrency(Locale.UK);  
	    printCurrency(Locale.US); 
	    printCurrency(Locale.FRANCE);  
		
	}

}
