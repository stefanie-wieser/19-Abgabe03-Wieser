package at.fhj.iit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	/**
	 * inits Calculator with CalculatorImpl
	 */
	@Before
	public void setup(){

		// SETUP PHASE
		calc = new CalculatorImpl();
	}

	@Test
	public void testAdd() {

		// EXERCISE PHASE
		double value = calc.add(5, 2);

		// VERIFY PHASE
		assertEquals(7, value, 0.001);
	}

	/**
	 * tests calculator function add
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testAdd2() {

		double val = calc.add(4,3);
		double sum = calc.add(8,9);

		assertEquals(7, val, 0.001);
		assertEquals(17, sum, 0.001);
	}

	/**
	 * tests calculator function minus
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMinus() {

		double val1 = calc.minus(4,3);
		double sum1 = calc.minus(8,9);

		assertEquals(1, val1, 0.001);
		assertEquals(-1, sum1, 0.001);
	}

	/**
	 * tests calculator function multiply
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testMultiply() {
		double val2 = calc.multiply(4,3);
		double sum2 = calc.multiply(8,9);

		assertEquals(12, val2, 0.001);
		assertEquals(72, sum2, 0.001);

	}

	/**
	 * tests calculator function divide
	 * use the function
	 * use assertEquals to verify the result
	 */
	@Test
	public void testDivide() {

		double val3 = calc.divide(4,2);
		double sum3 = calc.divide(8,4);

		assertEquals(2, val3, 0.001);
		assertEquals(2, sum3, 0.001);
	}


	// VERIFY
	@Test(expected = ArithmeticException.class)
	public void testDivideWithNull(){
		// EXERCISE
		calc.divide(5, 0);
	}
}
