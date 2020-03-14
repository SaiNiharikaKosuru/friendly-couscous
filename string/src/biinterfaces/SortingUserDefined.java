package biinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Apple",30000);
		Product p3=new Product(1003,"Voltus",20000);
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		product.add(p3);
		List<Product> list=product.stream()
		.sorted((a,b)->a.name.compareTo(b.name))
		.collect(Collectors.toList());
		//.forEach(System.out::println);
		System.out.println(list);
		

	}

}
