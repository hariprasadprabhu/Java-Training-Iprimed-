package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
        list.add("ramesh");
        list.add("suresh");
        list.add("rohith");
        list.add("anand");
        /*
         * Iterator<String> itr=list.iterator();
         * 
         * while(itr.hasNext()) { System.out.println(itr.next()); }
         */
        
        list.get(1);
        
        for(String name:list)
                System.out.println(name);
        
        System.out.println("at index 1\t"+list.get(1));
        
   System.out.println("---------------------");
        list.set(0, "ganesh");
        
        for(String name:list)
                System.out.println(name);
        
        System.out.println("---------------------");
        Collections.sort(list);
        
        for(String name:list)
                System.out.println(name);
        System.out.println("One more list---------------------");
        
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(5);
        list1.add(15);
        list1.add(3);
        
        for(int a:list1)
                System.out.println(a);
        
        System.out.println("----------");
        Collections.sort(list1);
        
        System.out.println("---------------------");
        for(int a:list1)
                System.out.println(a);
        
        System.out.println("oooooooooo---------------------");
        
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("lion");
        list2.add("tiger");
        list2.add("cat");
        list2.add("dog");
        
        System.out.println("---------------------");
        list.addAll(list2);
        
        for(String l:list)
                System.out.println(l);
        
        System.out.println("---------------------");
        
        list.removeAll(list2);
        
        System.out.println("---------------------");
        for(String l:list)
                System.out.println(l);

        System.out.println("---------------------");
        
        list.removeIf(str -> str.contains("suresh"));
        
        for(String l:list)
                System.out.println(l);
        
        System.out.println("---------------------");
        
        list.clear();
        System.out.println("---------------------");
        for(String l:list)
                System.out.println(l);

	}

}
