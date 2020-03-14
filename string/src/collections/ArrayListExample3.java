package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("JAVA");
		ar.add("DOTNET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		System.out.println(ar);
		
		Iterator itr=ar.iterator();
		while(itr.hasNext())		
			System.out.println(itr.next());
		
		ar.add(0,"Data Science");
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		
		ar.set(2, "JAVA8");
		System.out.println(ar);
		
		ar.remove(2);
		System.out.println(ar);
		
		boolean search=ar.contains("JAVA");
		if(search) {
			System.out.println("Element found..");
		}
		else
			System.out.println("Element not found");
		
		Collections.sort(ar);
		System.out.println("Elements in sorted order");
		System.out.println(ar);
		
		List sublist=new ArrayList();
		sublist=ar.subList(1,3);
		System.out.println(sublist);
		
		ArrayList ar1=new ArrayList();
		ar.add("JAVA1");
		ar.add("DOTNET1");
		ar.add("SELENIUM1");
		ar.add("ORACLE1");
		ar.addAll(ar1);
		System.out.println(ar);
		
		int a=ar.size();
		for(int i=0;i<a;i++){
			System.out.println(ar.get(i));
		}
		
		
		
		

	}

}
