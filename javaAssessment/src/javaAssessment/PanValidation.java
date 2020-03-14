package javaAssessment;

import java.util.Scanner;

public class PanValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the PAN number");
		String s=scanner.next();
		pannumber(s);
		
	}
	public static void pannumber(String st) {
		if(st.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
		{
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");
		}

}
