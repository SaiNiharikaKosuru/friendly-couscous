package biinterfaces;
import java.util.*;
class CollegeGroups{
	String d1,d2,d3;
	public CollegeGroups(String d1,String d2,String d3) {
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
	}
	@Override
	public String toString() {
		return "CollegeGroups [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	
}

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,CollegeGroups> hm=new HashMap<String,CollegeGroups>();
		
		hm.put("JNTU", new CollegeGroups("CSE","ECE","EEE"));
		hm.put("SVU", new CollegeGroups("CSE","CIVIL","MECH"));
		hm.put("OU", new CollegeGroups("IT","ECE","CIVIL"));
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the course to search");
		String course=scanner.next();
		System.out.println("The following universities offer the course..");
		
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			CollegeGroups i=(CollegeGroups)me.getValue();
			if(i.d1.equals(course)||i.d2.equals(course)||i.d3.equals(course))
				System.out.println(me.getKey());
		}
			
	}

}
