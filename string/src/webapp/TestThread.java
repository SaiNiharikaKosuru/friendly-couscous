package webapp;

public class TestThread {
	public static void main(String[] args) {
		Runnable runnable=()->System.out.println("Insite the thread...");
		Thread t=new Thread(runnable);
		t.start();
	}

}
