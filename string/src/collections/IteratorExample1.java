package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1 {
	
	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("Java");
		ar.add("Dotnet");
		ar.add("Selenium");
		System.out.println(ar);
		
		Iterator itr=ar.iterator();
		
		ListIterator ltr=ar.listIterator();
		while(ltr.hasNext())		//checks for the next available elements
			System.out.println(ltr.next());//returns next available element
		System.out.println("Elements in reverse order..");
		while(ltr.hasPrevious())		//checks for the next available elements
			System.out.println(ltr.previous());	//returns
		
		
		
		
		
		
	}

}
