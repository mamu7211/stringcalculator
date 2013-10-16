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
	public void whenAddingEmptyStringAddShouldReturnZero() {
		assertEquals(Integer.valueOf(0), calc.add(""));
	}

	@Test
	public void whenAddingOneAddShouldReturnOne() {
		assertEquals(Integer.valueOf(1), calc.add("1"));
	}

	@Test
	public void whenAddingZeroAddShouldReturnZero() {
		assertEquals(Integer.valueOf(0), calc.add("0"));
	}

	@Test
	public void whenAddingTwoToThreeAddShouldReturnFive() {
		assertEquals(Integer.valueOf(5), calc.add("2,3"));
	}

	@Test
	public void whenAddingSeveralNumbersItShouldReturnTheSum() {
		assertEquals(Integer.valueOf(15), calc.add(generateNumbers(1,15)));
	}

	@Test
	public void whenAdding20Time153ItShouldReturn3060() {
		assertEquals(Integer.valueOf(3060), calc.add(generateNumbers(20,153)));
	}
	
	@Test
	public void whenAdding12345678Times9999tShouldReturn3060() {
		assertEquals(Integer.valueOf(12345678*9999), calc.add(generateNumbers(12345678,9999)));
	}
	
	@Test
	public void testGenerateNumbersHelperMethod() {
		String numbers = generateNumbers(3, 15);
		assertEquals("3,3,3,3,3,3,3,3,3,3,3,3,3,3,3", numbers);
	}

	private String generateNumbers(int number, int repetitions) {
		StringBuilder sb = new StringBuilder();
		String delim = "";
		for (int currentNumber = 0; currentNumber < repetitions; currentNumber++) {
			sb.append(delim);
			sb.append(number);
			delim = ",";
		}
		return sb.toString();
	}
}
