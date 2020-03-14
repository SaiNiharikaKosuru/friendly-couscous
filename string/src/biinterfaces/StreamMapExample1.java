package biinterfaces;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class StreamMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Function<Integer,Integer> f=x->x*2;
		ar.add(0);
		ar.add(5);
		ar.add(10);
		ar.add(12);
		ar.add(14);
		ar.add(25);
		ar.add(30);
		ar.add(32);
		
		ar.stream().map(f).forEach(System.out::println);
		List list=ar.stream().map(x->x*3).collect(Collectors.toList());
		System.out.println(list);

	}

}
