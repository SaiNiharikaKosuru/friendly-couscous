package predicate;
import java.util.function.Supplier;

public class supplierExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s=()->{
			String[] s1= {"Sunny","Bunny","Funny","Pinny"};
			int x=(int)(Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
