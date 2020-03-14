package biinterfaces;
import java.util.function.*;
public class BiPredicateExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> bi=(a,b)->(a+b)%2==0;
		System.out.println(bi.test(10, 2));
		System.out.println(bi.test(1, 1));
		System.out.println(bi.test(1, 2));
		
		

	}

}
