package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}


public class ClassesOfCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1002,"Apple",30000);
		Product p3=new Product(1003,"Voltus",20000);
		ArrayList<Product> product=new ArrayList<Product>();
		product.add(p1);
		product.add(p2);
		product.add(p3);
		
		List<Double> productPriceList=
				product.stream()
				.map(x->x.price)		//fetching price
				.collect(Collectors.toList());   //collecting as list
		
		Set<Double> productPriceList1=
				product.stream()
				.map(x->x.price)		//fetching price
				.collect(Collectors.toSet());

	}

}
