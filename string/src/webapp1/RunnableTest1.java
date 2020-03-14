package webapp1;

class MyRunThread implements Runnable{
	public void run() {
		for(int i=101;i<=200;i++) {
			System.out.println(i);
		}
	}
	public int getPriority() {
		return 1;
	}
	public void myfunction() {
		//..
	}
}

public class RunnableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			for(int i=101;i<=200;i++)
				System.out.println(i);
		};
		Thread t=new Thread(r);
		t.start();

	}

}
