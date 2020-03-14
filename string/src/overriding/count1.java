package overriding;
class Box{
	static int count;
	Box(){
		count++;
	}
	public void showCount() {
		System.out.println("The number of objects"+count);
	}
}

public class count1 {
	public static void main(String args[])
	{
		Box b1=new Box();
		
		Box b2=new Box();
		Box b3=new Box();
		Box b4=new Box();
		b4.showCount();
		
	}
	

}

