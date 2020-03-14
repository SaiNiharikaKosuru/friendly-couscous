package jUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTestClass {
	@Test
	public void test2() {
	System.out.println("cse2");
	}
	@Test
	public void test1() {
		System.out.println("this is my test");
	}
	@BeforeEach
	public void pree() {
		System.out.println("this is m");
	}

}
