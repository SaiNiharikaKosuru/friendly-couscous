package predicate;

import java.util.function.Predicate;

interface Test{
	public boolean teststr(int a);
}

public class predicateExample {
	public static void main(String[] args) {
		
		Predicate<String> p5=str->(str.charAt(0)=='K');
		Predicate<Integer> p4=i->{boolean flag=true;
			for(int x=2;x<i;x++)
			{
				if(i%x==0)
				{
					flag=false;
					break;
				}
			}
			return flag;
		};
		System.out.println(p4.test(6));
		System.out.println(p4.test(11));
		System.out.println(p5.test("Kosuru"));
	}

}
