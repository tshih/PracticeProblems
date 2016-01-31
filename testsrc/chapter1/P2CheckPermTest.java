package chapter1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class P2CheckPermTest {

	private P2CheckPerm tObj;
	
	@Before
	public void setUp() {
		tObj = new P2CheckPerm();
	}
	
	@Test
	public void test() {
		assertTrue(tObj.checkPerm("asdfghj", "jhgfdsa"));
	}
	
	@Test
	public void test2() {
		assertFalse(tObj.checkPerm("asdff", "asd"));
	}

}
