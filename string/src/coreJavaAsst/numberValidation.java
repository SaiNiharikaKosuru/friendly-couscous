package coreJavaAsst;
import java.util.Scanner;

public class numberValidation {
	public static int phoneNumberValidation(String s) {
		int pno=0;
		if(s.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"));
			{
				pno=1;
			}
			
		return pno;
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a phone number");
		String phone=s.next();
		int pno=phoneNumberValidation(phone);
		if(pno==1) {
			System.out.println("CREDENTIALS ARE CORRECT");
		}
		else
		{
			System.out.println("Credentials are wrong");
		}
		
		
	}

}
