package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		long start, end;
		
		start = System.nanoTime();
		for(int i=0;i<10000000;i++)
			alist.add(i);
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end - start));

		start = System.nanoTime();
		for(int i=0;i<10000000;i++)
			llist.add(i);
		end = System.nanoTime();
		System.out.println("LinkedList : "+(end - start));
			
		start = System.nanoTime();
		for(int i=0;i<10000000;i++)
			alist.get(i);
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end - start));
		
		start = System.nanoTime();
		for(int i=0;i<10000000;i++)
			llist.get(i);
		end = System.nanoTime();
		System.out.println("LinkedList : "+(end - start));

	}

}









