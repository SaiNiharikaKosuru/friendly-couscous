package string;
public class isPrime{
	
public static boolean primeNu(int number) {
	boolean flag=true;
	for(int x=2;x<number/2;x++)
	{
		if(number%x==0)
		{
			flag= false;
			break;
		}
		
	}
	if(flag==true)
		return true;
	else
		return false;
}

}
