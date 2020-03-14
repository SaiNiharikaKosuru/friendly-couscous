package coreJavaAsst;
import java.util.Scanner;

public class sumOfOddDigits {
	public static int Sum(int n) {
		int sum=0,rem;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(n%2==0)
			return -1;
			else
				return 1;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  number:");
		int number=s.nextInt();
		System.out.println(Sum(number));
		
	}

}
