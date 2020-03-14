package javaAssignment1;

import java.util.Scanner;

public class FifthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i,j,k=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		str=scanner.nextLine();
		String reverse="";
		for(i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);

	}

}
