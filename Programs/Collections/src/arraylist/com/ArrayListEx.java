package arraylist.com;

import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("ramesh");
        list.add("suresh");
        list.add("rohith");
        list.add("anand");
        
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("lion");
        list2.add("suresh");
        list2.add("cat");
        list2.add("dog");
        System.out.println("Before retain all "+list);
        list.retainAll(list2);
        System.out.println("after applying retainall "+list);
        System.out.println("check list is empty :"+list.isEmpty());
        list.clear();//to clear all the elements
        System.out.println("After clearing check list is empty :"+list.isEmpty());

	}

}
