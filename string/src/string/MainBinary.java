package string;

import java.util.Scanner;

public class MainBinary {
	public static void main(String[] args) {
		int[] array=new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size less than 10");
		int n=scanner.nextInt();
		for(int x=0;x<n;x++)
		{
		
			array[x]=scanner.nextInt();
		
		}
		System.out.println("Enter elements");
		int element=scanner.nextInt();
		System.out.println(Binary.findElement(array,element));
		
	}
}
	
	

