package jsp;

import java.util.HashMap;
import java.util.Scanner;

public class HashingOfLowestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
