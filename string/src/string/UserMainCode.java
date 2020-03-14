package string;
import java.util.Scanner;
public class UserMainCode {
	public static int checkSum(int n) {
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(sum%2==0)
			return -1;
		else
			return 1;
		
		
		
	}
	public static void main(String[] args) {
		//read the value
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println(UserMainCode.checkSum(num));
	}
}

	