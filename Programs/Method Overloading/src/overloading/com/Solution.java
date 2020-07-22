package overloading.com;

public class Solution {

	public static void main(String[] args) {
		Addition ad = new Addition();
		int a=10,b=20,c=30;
		float e=2.5f,f=3.5f, g=3.4f;
		double h=457.76554,i=45.34232,j=34.3443;
		ad.add(a,b,c);
		ad.add(e,f,g);
		ad.add(h, i, j);
		int[] a = {1,2,3};
	}

}
