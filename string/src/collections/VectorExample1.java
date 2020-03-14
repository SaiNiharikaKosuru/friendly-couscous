package collections;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Stack;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("Hai");
		v.add("Hello");
		v.addElement("hey");
		System.out.println(v);
		
		Stack s=new Stack();
		s.push("Java");
		s.push("Oracle");
		s.push("Testing");
		System.out.println(s);
		String temp=(String) s.pop();
		System.out.println(temp);
		System.out.println(s.peek());
		System.out.println(s);
		
		
		

	}

}
