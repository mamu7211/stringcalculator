package stringcalculator;

import org.apache.commons.lang.StringUtils;

public class StringCalculator {

	public Integer add(String string) {
		return StringUtils.isBlank(string)?0:1;
	}
}
