package stringcalculator.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import stringcalculator.StringCalculator;

public class StringCalculatorTests {

	private StringCalculator calc;

	@Before
	public void setUp() {
		calc = new StringCalculator();
	}

	@Test
	public void foo() {
		assertEquals(Integer.valueOf(0), calc.add(""));
	}

	@Test
	public void bar() {
		assertEquals(Integer.valueOf(1), calc.add("1"));
	}
}
