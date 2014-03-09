package roman;

import java.util.HashMap;
import java.util.Map;

public class Roman {

	private String romanNumber;

	private Map<String, Integer> basicNumbers;

	public Roman(String romanNumber) {
		this.romanNumber = romanNumber;
		this.basicNumbers = new HashMap<String, Integer>();

		basicNumbers.put("I", 1);
		basicNumbers.put("V", 5);
		basicNumbers.put("X", 10);
	}

	public int intValue() {
		int value = 0;

		Integer lastDigit = null;
		for (int i = 0; i < romanNumber.length(); i++) {
			int digit = basicNumbers.get(romanNumber.substring(i, i + 1));

			if (lastDigit != null && digit > lastDigit) {
				value = digit - value;
				if (value < 0) {
					value = -value + digit;
					value = value - lastDigit;
					value = value + digit - lastDigit;
				}
			} else {
				value = value + digit;

			}

			lastDigit = digit;
		}

		return value;
	}

}
