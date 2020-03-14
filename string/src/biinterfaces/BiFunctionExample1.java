package biinterfaces;
import java.util.function.*;

public class BiFunctionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
		BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
		BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
		
		
		System.out.println(add.apply(10,20));
		System.out.println(sub.apply(20,10));
		System.out.println(mul.apply(10,20));
	
		
		
		
		
		

	}

}
