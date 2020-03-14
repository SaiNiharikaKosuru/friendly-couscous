package biinterfaces;
import java.util.*;
class Employee2{
	String name;

	public Employee2(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + "]";
	}
	
}
public class MapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Employee2> hm=new HashMap<String,Employee2>();
		ArrayList<String> ar=new ArrayList<String>();
		
		hm.put("1234",new Employee2("niharikA"));
		hm.put("2341",new Employee2("Nikki"));
		hm.put("3456",new Employee2("nihU"));
		hm.put("3412",new Employee2("Sai"));
		
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			Employee2 e=(Employee2)me.getValue();
			
			if(e.name.charAt(0)>=97 && e.name.charAt(0)<=122 && e.name.charAt(e.name.length()-1)>=65 && e.name.charAt(e.name.length()-1)<=90) {
				ar.add(e.name);
			}
		

	}
		System.out.println("The names are:");
		for(String c:ar) {
			System.out.println(c);
		}

	}
	
}
