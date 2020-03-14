package webapp1;
import java.util.Scanner;

public class generic {
	public static void main(String[] args) {
		int e,f,h;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter e,f");
		e=cin.nextInt();
		f=cin.nextInt();
		try {
			h=e/f;
			System.out.println("The quotient is:"+h);
		}
		catch(java.lang.ArithmeticException obj)
		{
			System.out.println("The error is:"+obj);
		}
		System.out.println("Hello Java");
		System.out.println("Exception Handling");
	}
	

}
