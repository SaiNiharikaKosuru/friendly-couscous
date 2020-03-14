package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassMethodsExample1 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
	
		ar.add("JAVA");
		ar.add("DOTNET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println("Elements in sorted order");
		System.out.println(ar);
		
		
		Collections.reverse(ar);
		System.out.println("Elements in reverse order");
		System.out.println(ar);
		
		ArrayList arnew=new ArrayList();
		arnew.add("JAVA");
		arnew.add("DOTNET");
		arnew.add("SELENIUM");
		
		//Collections.copy(arnew,ar);
		//System.out.println("Elements in arnew list are");
		//System.out.println(arnew);
		
		Collections.fill(ar,"Language");
		System.out.println("After filling in a list...");
		System.out.println(ar);
		
		//boolean flag=Collections.disjoint(ar,arnew);
		//System.out.println(flag);
		
		
		
	}
}
