package biinterfaces;
import java.util.*;

public class AllCollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Hai");
		ar.add("Hello");
		
		Set<String> set=new TreeSet<String>();
		set.add("Niha");
		set.add("Nikki");
		
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Java");
		q.add("Dotnet");
		
		HashMap<String,Collection> hm=new HashMap<String,Collection>();
		
		hm.put("1234", ar);
		hm.put("234", set);
		hm.put("4567", q);
		
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			Collection c=(Collection)me.getValue();
			System.out.println(me.getKey()+""+c);
		}
		

	}

}
