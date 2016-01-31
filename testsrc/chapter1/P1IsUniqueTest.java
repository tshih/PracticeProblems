package chapter1;

import static org.junit.Assert.*;

import org.junit.Before;

import chapter1.P1IsUnique;

import org.junit.Test;

public class P1IsUniqueTest {

	private P1IsUnique tObject;
	
	@Before
	public void setUp() {
		tObject = new P1IsUnique();
	}
	
	@Test
	public void testNull() {
		assertFalse(tObject.isUnique(null));
	}
	
	@Test
	public void testNotUnique() {
		assertFalse(tObject.isUnique("asdfa"));
		assertFalse(tObject.isUnique("astieowruwoieruwioeu"));
	}
	
	@Test
	public void testUnique() {
		assertTrue(tObject.isUnique("asdfghj"));
	}
	

}
