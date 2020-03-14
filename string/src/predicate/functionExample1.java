package predicate;
import java.util.function.Function;
import java.util.function.Function;
public class functionExample1 {
	public static void main(String[] args) {
		
		Function<String,Integer> f=s->s.length();
		System.out.println("The length of string India is:"+f.apply("INDIA"));
		
		Function<Integer,Integer> f2=n->n*n;
		System.out.println("The square of 4 is:"+f2.apply(4));
		
		Function<Integer,Integer> fact=x->{
			int b=1;
			for(int i=2;i<=x;i++) {
				b=b*i;
			}
			return b;
		};
		System.out.println("Factorial of 4 is:"+fact.apply(4));
		
		Function<String,Integer> vcount=s->{
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
					count++;
			}
			return count;
		};
		System.out.println("Vowel count in apple is:"+vcount.apply("apple"));
		
		Function<String,Integer> space=p->{
			int count=0;
			for(int i=0;i<p.length();i++) {
				if(p.charAt(i)==' ') 
					count++;
			}
			return count;
			};
		System.out.println("The length of string is:"+space.apply("hello everyone"));
		
		
		}
		
	}
