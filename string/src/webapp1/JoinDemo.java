package webapp1;
class HelloThread extends Thread{
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("Hello Thread");
			try {
				sleep(0);
			}
			catch(Exception e) {
				
			}
		}
	}
}

public class JoinDemo {
	
	public JoinDemo() {
		//
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HelloThread t1=new HelloThread();
		t1.start();
		t1.join();
		//t1.yield();
		for(int i=101;i<=200;i++) {
			System.out.println("Main Thread");
		}

	}

}
