package be.jslm.exercises;

import junit.framework.Assert;

import org.junit.Test;

public class TestPalinDrome {
	
	final String happyPath = "lvl";
	final String errorly = "Jonas";
	final String helloWorld = "Hello World";
	
	// class under test
	PalinDrome p1 = new PalinDrome();

	@Test
	public void testPalin(){
		
		Assert.assertEquals("lvl reversed should be lvl", true, p1.reverseString(happyPath));
		Assert.assertFalse(p1.reverseString(errorly));					
		Assert.assertFalse(p1.reverseString(helloWorld));
	}
}