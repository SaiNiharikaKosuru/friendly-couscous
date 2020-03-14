package predicate;
import java.util.function.Consumer;

public class consumerExample1 {
	
	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Hello");
		c.accept("Niha");
		
		Consumer<Integer> p=x->{
			if(x>=20) {
				System.out.println("Greater than 20");
			}
			else
				System.out.println("Less than 20");
		};
		p.accept(30);
	}

}
