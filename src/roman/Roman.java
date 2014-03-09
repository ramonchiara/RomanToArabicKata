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
		basicNumbers.put("II", 2);
		basicNumbers.put("III", 3);
		basicNumbers.put("IV", 4);
		basicNumbers.put("V", 5);
	}

	public int intValue() {
		return basicNumbers.get(romanNumber);
	}

}
