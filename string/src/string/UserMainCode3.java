package string;

public class UserMainCode3 {
	public static String  findRoots(int a, int b,int c) {
		int root=(b*b)-4*a*c;
		if(root==0){
			System.out.println("Roots are equal");
		}
		if(root>=0) {
			System.out.println("Roots are real and unequal ");
		}
		if(root<=0) {
			System.out.println("Roots are real and equal");
		}
		
		return null;
		
	}

}
