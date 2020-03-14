package biinterfaces;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Apple",30000);
		Product p3=new Product(1003,"Voltus",20000);
		Product p4=new Product(1004,"Apple",51000);
		Product p5=new Product(1005,"Apple",53000);
		Product p6=new Product(1006,"Samsung",25000);
		Product p7=new Product(1007,"Samsung",63000);
		Product p8=new Product(1008,"Apple",59000);
		Product p9=new Product(1009,"Voltus",32000);
		Product p10=new Product(1011,"Voltus",41000);
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p5);
		product.add(p6);
		product.add(p7);
		product.add(p8);
		product.add(p9);
		product.add(p10);
		Product p= product.stream()
				.filter(a->a.name.equals("Apple"))
				.sorted((a,b)->a.price.compareTo(b.price))
				.map(a->a)
				.max((Product a,Product b)->a.price<b.price?-1:1)
				.get();
				System.out.println(p);

	}

}
