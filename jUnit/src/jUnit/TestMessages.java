package jUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessages {
	@Test
	public void test1() {
		HelloWorld hw=new HelloWorld();
		assertEquals("message 1",hw.msg1());
	}

}
