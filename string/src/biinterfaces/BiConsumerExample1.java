package biinterfaces;
import java.util.function.*;

public class BiConsumerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> bi=(s1,s2)->System.out.println(s1.concat(s2));
		bi.accept("Sai", "Niharika");

	}

}
