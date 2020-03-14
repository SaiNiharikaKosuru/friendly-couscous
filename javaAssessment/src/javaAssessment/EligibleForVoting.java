package javaAssessment;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		super("Age is Less than 0(Negative)");
	}
}
class InsufficientAgeException extends Exception
{
	public InsufficientAgeException()
	{
		super("Age is Less Than 18");
	}

}
class Voting 
{
	public void testingOfAge(int age) throws InsufficientAgeException,InvalidAgeException
	{
		if(age>0 && age<18)
			throw new InsufficientAgeException();
		else if(age<0)
			throw new InvalidAgeException();
		else
			System.out.println("Eligible to Vote");
	}
}

public class EligibleForVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an age");
		age=sc.nextInt();
		Voting v=new Voting();
		try
		{
			v.testingOfAge(age);
		}
		catch(InsufficientAgeException e)
		{
			System.out.println(e);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
}

	
