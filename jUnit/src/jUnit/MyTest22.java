package jUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyTest22 {
	@Category(PerformanceTests.class)
	@Test
	public void test123() {
		System.out.println("Performance class..");
	}

}
