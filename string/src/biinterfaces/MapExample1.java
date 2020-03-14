package biinterfaces;
import java.util.*;
class Student1{
	int htno;
	int m1,m2;
	Student1(int htno,int m1,int m2){
		this.htno=htno;
		this.m1=m1;
		this.m2=m2;
		
	}
	@Override
	public String toString() {
		return "Student1 [htno=" + htno + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
	
}

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student1> hm=new HashMap<Integer,Student1>();
		hm.put(1001, new Student1(11,25,75));
		hm.put(1002, new Student1(12,25,10));
		hm.put(1003, new Student1(13,20,35));
		hm.put(1004, new Student1(14,15,65));
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		System.out.println("Students who failed in m2 are:");
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			Student1 i=(Student1)me.getValue();
			if(i.m2<=40)
				System.out.println(me.getKey()+""+i.htno);
				
		}
		
		
		
		

	}
	  
}	   
