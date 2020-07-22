class ArrayThreeD
{
	public static void main(String args[])
	{
		int[][][] a = new int[2][][];
		a[0]= new int[3][3];
		a[1]= new int[3][3];
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{	a[i][j][k]=count++;
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		System.out.println();
		}
	}
}