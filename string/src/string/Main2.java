package string;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size less than 10");
		int n=scanner.nextInt();
		int array[]=new int [n];
		
		for(int x=0;x<n;x++)
		{
			System.out.println("Enter array element");
			array[x]=scanner.nextInt();
		
		}
		System.out.println("Enter elements");
		int se=scanner.nextInt();
		
		System.out.println(UseMainCode.findElement(array,n));
		
	}

}
