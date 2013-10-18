package stringcalculator;

import org.apache.commons.lang.StringUtils;

public class StringCalculator {

	public Integer add(String numbers) {
		if (StringUtils.isEmpty(numbers)) {
			return 0;
		}
		return splitAndAddNumbers(removeNewLines(numbers));
	}

	private String removeNewLines(String numbers) {
		return numbers.replace("\n", ",");
	}

	private Integer splitAndAddNumbers(String numbers) {
		int sum = 0;
		for (String number : StringUtils.split(numbers, ',')) {
			sum += parseNumber(number);
		}
		return sum;
	}

	private int parseNumber(String number) {
		if (number.trim().length() == 0) {
			return 0;
		}
		return Integer.parseInt(number.trim());
	}
}
