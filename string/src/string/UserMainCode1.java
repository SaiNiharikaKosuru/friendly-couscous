package string;

import java.util.Scanner;

public class UserMainCode1 {
	public static int countVowels(String string) {
		int count=0;
		for(int x=0;x<=string.length();x++)
		{
			if(string.charAt(x)=='a'||string.charAt(x)=='e'||string.charAt(x)=='i'||string.charAt(x)=='o'||string.charAt(x)=='u')
{
	count++;
}
		}
		return count;
		
	}

	public static class Main{
                    public static void  main(String[] args) {
			
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println();
		str=s.next();
		System.out.println(countVowels(str));
		
	}
		
	}
}
	


