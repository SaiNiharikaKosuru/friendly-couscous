package collections;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList ar=new LinkedList();
		int[] a= {10,20,30,40};
		ar.add("JAVA");
		ar.add("DOTNET");
		ar.add("SELENIUM");
		ar.add("ORACLE");
		
		ArrayList ar1=new ArrayList();
		ar1.add("datascience");
		ar1.add(":Python");
		ar1.add("BigData");
		ar.addAll(ar1);		
		
		for(int x:a)
			System.out.println(x);
		

}
}