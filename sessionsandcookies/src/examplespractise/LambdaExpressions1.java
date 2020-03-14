package examplespractise;

public class LambdaExpressions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a=()->{
			for(int i=0;i<10;i++)
				System.out.println(i);
		};
		Thread t=new Thread(a);
		t.run();

	}

}
