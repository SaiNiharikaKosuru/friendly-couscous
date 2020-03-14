package jUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyTest11 {
	@Category(RegressionTests.class)
	@Test
	public void test12() {
		System.out.println("Regression class..");
	}

}
