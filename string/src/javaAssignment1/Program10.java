package javaAssignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i,j,k=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string:");
		str=scanner.nextLine();
		Pattern p=Pattern.compile("#[A-F a-f 0-9]{6}");
		Matcher m=p.matcher(str);
		boolean d=m.matches();
		if(d) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not matched"); 
			
		}

	}

}
