package throwss.com;

import java.io.IOException;

public class Colleg {
	void doo() throws IOException
	{
		throw new IOException();
	}
	void doo1() throws IOException // one way
	{
		doo();
	
	}
	void doo2() // second way
	{
		try {
			doo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void  doo3()
	{
		
	}

}
