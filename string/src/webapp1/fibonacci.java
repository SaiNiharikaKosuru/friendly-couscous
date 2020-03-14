package webapp1;

public class fibonacci {
	public static int fib(int n)
	{
		if((n==0)||(n==1))
			return (n);
		else
			return fib(n-1)+fib(n-2);
	}
	public void primeCheck(int n)
	{
		boolean temp=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%2==0)
			{
				temp=false;
				break;
			}
		}
		if(temp)
			System.out.println("It is prime");
		else
			System.out.println("Not a prime");
	}
	public static void main(String[] args)
	{
		
		fibonacci obj=new fibonacci();
		obj.fib(5);
		obj.primeCheck(5);
	}

}
