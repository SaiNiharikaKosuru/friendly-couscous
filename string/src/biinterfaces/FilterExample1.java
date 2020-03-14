package biinterfaces;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Predicate<Integer> p1=x->x%5==0;
		ar.add(0);
		ar.add(5);
		ar.add(10);
		ar.add(12);
		ar.add(14);
		ar.add(25);
		ar.add(30);
		ar.add(32);
		System.out.println(ar);
		/*Stream s=ar.stream();
		List<Integer> list=(List<Integer>) s.filter(p1).collect(Collectors.toList());
		System.out.println(list);*/
		
		ar.stream()
				.filter(x->x%2==0)
				.forEach(System.out::println);
		
		
		

	}

}
