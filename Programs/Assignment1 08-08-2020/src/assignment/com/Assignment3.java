package assignment.com;

import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the list:::");
		Integer size = sc.nextInt();
		Integer value;
		System.out.println("Enter elements in the list::");
		for (int i = 0; i < size; i++) {
			value = sc.nextInt();
			ar.add(value);
		}
		ar.remove(0);
		System.out.println(ar);
		System.out.println("Enter your queries::");
		Integer query = sc.nextInt();
		while (query != 0) {
			System.out.println("Enter operation::");
			String operation = sc.next();
			if (operation.equals("Insert")) {
				System.out.println("Enter index and value::");
				Integer index = sc.nextInt();
				Integer Value = sc.nextInt();
				ar.add(index, Value);
			} else if (operation.equals("Delete")) {
				System.out.println("Enter index::");
				int index = sc.nextInt();
				ar.remove(index);
			}
			query--;
		}
		System.out.println(ar);
		for (Integer a : ar) {
			System.out.println(a);
		}
	}

}