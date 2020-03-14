package biinterfaces;

import java.util.ArrayList;

public class MaxUserdefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Apple",30000);
		Product p3=new Product(1003,"Voltus",20000);
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		product.add(p3);
		Product p=product.stream()
				.max((Product a,Product b)->a.price<b.price?-1:1)
				.get();
				System.out.println(p);

	}

}
