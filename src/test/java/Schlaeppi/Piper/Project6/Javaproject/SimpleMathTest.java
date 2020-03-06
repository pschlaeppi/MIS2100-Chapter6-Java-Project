package Schlaeppi.Piper.Project6.Javaproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void test() {
		fail("Not yet implemented");
		
	} 
	@Test
	public void testThatZeroNumeratorReturnsZero() {
			
			SimpleMath simpleMath = new SimpleMath ();
			assertEquals(0, simpleMath.divide(0, 7), 0.001 );
			
	}
	@Test
	public void testThatSmallerNumeratorReturnsZero() {
			
			SimpleMath simpleMath = new SimpleMath ();
			assertEquals(0.25, simpleMath.divide(1, 4), 0.001 );
	}
	

	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		
			SimpleMath simpleMath = new SimpleMath ();
			simpleMath.divide(6, 0);
}
}
	
	
	
		



