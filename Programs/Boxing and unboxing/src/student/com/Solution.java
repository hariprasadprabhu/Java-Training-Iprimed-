package student.com;

public class Solution {

	public static void main(String[] args) {
		int a= 10;
		Integer i = new Integer(a);//boxing
		System.out.println(i);
		Integer i1 = 20;//boxing
		System.out.println(i1);
		
		//unboxing
		int aa=i1;//unboxing
		System.out.println(aa);
		if(aa>10)//auto unboxing
		{
			System.out.println("This is auto unboxing");
		}

	}

}
