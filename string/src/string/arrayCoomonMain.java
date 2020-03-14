package string;

import java.util.Scanner;

public class arrayCoomonMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array1 size ");
		int n1=scanner.nextInt();
		int[] arr1=new int[n1];
		for(int x=0;x<n1;x++)
		{
		
			arr1[x]=scanner.nextInt();
		
		}
		System.out.println("Enter array2 size ");
		int n2=scanner.nextInt();
		int[] arr2=new int[n2];
		for(int x=0;x<n2;x++)
		{
		
			arr2[x]=scanner.nextInt();
		
		}
		
		System.out.println(arrayCommon.commonSum(arr1,arr2));
	}
		

}
