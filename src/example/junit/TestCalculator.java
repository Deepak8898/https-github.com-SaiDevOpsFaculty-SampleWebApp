package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class TestCalculator {
 
	private math.Calculator calc;
  
	 @Before
	 public void setUp() throws Exception {
		 calc = new math.Calculator();
	 }
 
	 @After
	 public void tearDown() throws Exception {
		 calc = null;
	 }
	 
	 @Test
	 public void testAdd() {
		  double result = calc.add(10,20);
		  assertEquals(30, result, 0);
	 }
	 
	 @Test
	 public void testSubtract() {
		  double result = calc.subtract(100,50);
		  assertEquals(50, result, 0);
	 }
	 
	 @Test
	 public void testMultiply() {
		  double result = calc.multiply(2.5, 100);
		  assertEquals(250, result, 0);
	 }
	 
	 @Test
	 public void testDivide() {
		  double result = calc.divide(100, 10);
		  assertEquals(2, result, 0.001);
	 }
	  
	 @Test(expected = ArithmeticException.class)
	 public void testDivideByZero() {
		 calc.divide(100.5, 0);
	 }
 
}
