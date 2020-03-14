package coreJavaAsst;
import java.util.Scanner;


public class sumOfSquaresOfEvenDigits {
	public static int Square(int num) {
		int sum=0,rem=0;
		while(num!=0) {
			rem=num%10;
			if(rem%2==0) {
			sum=sum+(rem*rem);
			}
			num=num/10;
		}
		  return sum;
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		System.out.println(Square(n));
	}

}
