package jUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MyTest1 {
	
	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("Before all the methods");
	}
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
		
	}
	@Ignore
	@Category(RegressionTests.class)
	@Test
	public void test() {
		System.out.println("Inside the test1...");
		
	}
	@After
	public void afterTest() {
		System.out.println("This will be executed after every test..");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("This will be executed after all the methods");
	}
	

}
