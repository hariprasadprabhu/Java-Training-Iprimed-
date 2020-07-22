class ArrayOdd
{
	public static void main(String args[])
	{
		int[][] a= new int[2][3];
		int count = 0;
		for(int i = 0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++){
				if(count%2 != 0)
					a[i][j]=count;
				count++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]);
		System.out.println();
		}
	}
}