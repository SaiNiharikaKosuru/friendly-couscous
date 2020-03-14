package biinterfaces;
import java.util.*;
public class MapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of entries");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the year");
			int year=scanner.nextInt();
			System.out.println("Enter the number of admissions");
			int noa=scanner.nextInt();
			hm.put(year, noa);
			
			
		}
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		int max=0;
		int tyear=0;
		int temp=0;
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			temp=(Integer)entry.getValue();
			if(temp>max) {
				max=temp;
				tyear=(Integer)entry.getKey();
		}
		

	}
		System.out.println("The details of the admission are");
		System.out.println("year:"+tyear+"Admissions"+max);


}

}