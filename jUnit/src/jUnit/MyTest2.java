package jUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyTest2 {
	@Category(PerformanceTests.class)
	@Test(expected=ArithmeticException.class)
	public void testException() {
		int a=10,b=2,c=a/b;
		System.out.println(c);
		String str="Hello";
		System.out.println(str.charAt(9));
	}

}
