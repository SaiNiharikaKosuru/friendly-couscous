package string;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=scanner.nextInt();
		System.out.println("Enter b  value");
		int b=scanner.nextInt();
		System.out.println("Enter c square value");
		int c=scanner.nextInt();
		System.out.println(UserMainCode3.findRoots(a,b,c));
	}

}
