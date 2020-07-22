class Breakcontinue
{
	public static void main(String args[])
	{
		int a = 0;
		while(a<=10)
		{
			a++;
			if(a==5)
				continue;
			if(a==8)
				break;
			System.out.println(a);
			
		}
	}
}