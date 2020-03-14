package biinterfaces;
import java.util.*;
public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue d=  new PriorityQueue();
		d.add(10);
		d.add(20);
		d.add(4);
		d.add(5);
		System.out.println(d);
		
		d.remove();
		System.out.println("After removal..");
		System.out.println(d);
		d.add(25);
		System.out.println(d);
		d.remove();
		System.out.println("After removal of adding an element");
		System.out.println(d);
		

	}

}
