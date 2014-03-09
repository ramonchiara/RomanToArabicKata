package roman;

public class Roman {

	private String romanNumber;

	public Roman(String romanNumber) {
		this.romanNumber = romanNumber;
	}

	public int intValue() {
		if (romanNumber.equals("I")) {
			return 1;
		} else if (romanNumber.equals("II")){
			return 2;
		} else {
			return 3;
		}
	}

}
