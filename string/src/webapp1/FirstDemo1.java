package webapp1;

import webapp1.InnerDemo.One;

public interface FirstDemo1 extends  InnerDemo.One{
	 default void greater(int e,int f) {
		int g;
		g=(e>f)?e:f;
		System.out.println("The greater value is:"+g);
		
	}
	public static void main(String[] args) {
		FirstDemo1 obj=new FirstDemo1();
		obj.greater(11,13);
	}
	

}
