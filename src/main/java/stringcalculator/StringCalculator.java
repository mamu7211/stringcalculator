package stringcalculator;

import org.apache.commons.lang.StringUtils;

public class StringCalculator {

	public Integer add(String numbers) {
		if (StringUtils.isEmpty(numbers)) {
			return 0;
		}
		return splitAndAddNumbers(numbers);
	}

	private Integer splitAndAddNumbers(String numbers) {
		int sum = 0;
		for (String number : StringUtils.split(numbers, ',')) {
			sum += Integer.parseInt(number);
		}
		return sum;
	}
}
