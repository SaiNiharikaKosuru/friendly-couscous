package jsp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMainCode{
	public static Map increaseSalaries(int n,HashMap<Integer,String>hm1,HashMap<Integer,Integer>hm2) {
		HashMap<Integer,Integer> op=new HashMap<Integer,Integer>();
		 
		Set keys=hm1.keySet();
		Iterator itr=keys.iterator();
		 
		while(itr.hasNext()) {
			int id=(int) itr.next();
			String s=hm1.get(id);
			if(s.equals("manager")) {
				int newsal=hm2.get(id)+5000;
				op.put(id,newsal);
			}
		}
			
		
		return op;
	}
}

public class HashingAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
		
		System.out.println("Enter Employee Id:");
		int id=scanner.nextInt();
		System.out.println("Enter Employee designation:");
		String desg=scanner.next();
		System.out.println("Enter Employee salary:");
		int sal=scanner.nextInt();
		hm1.put(id,desg);
		hm2.put(id,sal);

	}
		hm=(HashMap<Integer, Integer>) UserMainCode.increaseSalaries(n,hm1,hm2);
		System.out.println(hm);
	
		 
		

}
}
