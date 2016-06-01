package chapter1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P3URLifyTest {
	
	private P3URLify testObj;

	@Before
	public void setUp() {
		testObj = new P3URLify();
	}	

	@Test
	public void testURLify() {
		String result = testObj.URLify("ab c  ", 4);
		assertEquals(result, "ab%20c");
	}

	@Test
	public void testURLify2() {
		String result = testObj.URLify("abc def ghi    ", 11);
		assertEquals(result, "abc%20def%20ghi");
	}

}
