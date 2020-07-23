package ageexception.com;

public class TestAge 
{
	static void testAge(int age) throws InvalidAge
	{
		if(age<18)
		{
			throw new InvalidAge("You can't vote");
		}
		else
		{
			System.out.println("You can vote");
		}
	}
}
