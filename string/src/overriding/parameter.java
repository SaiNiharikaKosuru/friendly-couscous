package overriding;

class Area{
	public void showArea1(int x)
	{
		System.out.println("area is:"+(x*x));
	}
	public void showArea1(int x,int y)
	{
		System.out.println("area is:"+(x*y));
	}
	public void showArea1(int x,int y,int z)
	{
		System.out.println("area is:"+(x*y*z));
	}
	public void showArea1(int x,int y,int z,int w)
	{
		System.out.println("area is:"+(x*y*z*w));
	}
	
	
}

public class parameter {
	public static void main(String[] args)
	{
		Area area=new Area();
		area.showArea1(5);
		area.showArea1(5,6);
		area.showArea1(5,6,7);
		area.showArea1(5,6,7,1);
		
		
	}

}
