package javaAssignment1;
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i,j,k=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		str=scanner.nextLine();
		String reverse="";
		for(i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		for(i=0;i<str.length();i++) {
			for(j=i+1;j<str.length();j++)
				if(str.charAt(i+1)=='a'||str.charAt(i+1)=='e'||str.charAt(i+1)=='i'||str.charAt(i+1)=='o'||str.charAt(i+1)=='u') {
					{
						if(str.charAt(i)!=str.charAt(j))
							k++;
					}
				}
		
				
			
			
		}
		
		

	if(str.equals(reverse)) {
		if(k>=2)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

		
	

}
}
