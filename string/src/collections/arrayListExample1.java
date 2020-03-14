package collections;
import java.util.*;
public class arrayListExample1 {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		int[] a= {10,20,30,40};
		ar.add("JAVA");
		ar.add("DOTNET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		
		ArrayList ar1=new ArrayList();
		ar1.add("datascience");
		ar1.add(":Python");
		ar1.add("BigData");
		ar.addAll(ar1);		//ar=ar+ar1;
		
		for(int x:a)
			System.out.println(x);
		
		System.out.println(ar);
		ar1.add("Ruby");
		
		if(ar.containsAll(ar1))  //as ruby is added lately to ar1.so this element is missing in ar.
			System.out.println("Element found..");
		else
			System.out.println("Element not found...");
		
		ar.retainAll(ar1);
		System.out.println("after removal..");
		System.out.println(ar);
		
	}

}
