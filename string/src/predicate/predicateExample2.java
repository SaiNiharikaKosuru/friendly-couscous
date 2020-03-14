package predicate;
import java.util.function.Predicate;
public class predicateExample2 {
	public static void main(String[] args) {
		String[] names= {"Niha","Pranu","Anu","Kosuru"};
		Predicate<String> ktest=s->s.charAt(0)=='K';
		for(String n:names) {
			if(ktest.test(n)) {
				System.out.println(n);
			}
		}
	}

}
