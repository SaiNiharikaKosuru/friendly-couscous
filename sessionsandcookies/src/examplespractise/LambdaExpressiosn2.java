package examplespractise;

 interface Sum{
	public int add(int a,int b);
}

public class LambdaExpressiosn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum z=(a,b)->a+b;
		int a=z.add(1, 2);
		System.out.println(a);
		

	}

	
}
