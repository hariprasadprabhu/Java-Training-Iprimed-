package strbuffer.com;

public class Solution {

	public static void main(String[] args) {
		
		/*//Declaration and capacity formula (newsize = (oldsize*2)+2 only after it crosses its old capacity
		StringBuffer sb = new StringBuffer("hai"); //defalt capacity+3
		System.out.println(sb.capacity());
		sb.ensureCapacity(20);
		System.out.println("new capacity"+sb.capacity());
		StringBuffer sb1 = new StringBuffer(); // default capacity
		sb1.append("hai");
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(20);
		System.out.println("new capacity "+sb1.capacity());
		*/
		
		/*//Check its mutable
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println();
		
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println();
		
		sb.insert(0, 'p');
		System.out.println(sb);
		*/
		
		//Substring
		StringBuffer sb = new StringBuffer("Hello hey");
		System.out.println(sb.substring(5, 9));// sb.substring(initialIndex, endIndex+1)
			

	}

}
