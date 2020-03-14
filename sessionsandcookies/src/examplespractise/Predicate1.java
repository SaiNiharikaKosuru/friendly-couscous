package examplespractise;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <Integer> pr=(t)->(t%2==0);
				System.out.println(pr.test(4));
				
		Function<Integer,Integer> f=a->(a*a);
		   System.out.println(f.apply(5));
		   
		BiFunction<Integer,Integer,Integer> bi=(a,b)->{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println(bi.apply(5, 9));
		

	}

}
