package roman;

import org.junit.Test;

public class TestRoman {

	@Test
	public void iShouldBeOne() {
		Roman roman = new Roman("I");
		int value = roman.intValue();
		assertThat(value, is(1));
	}

}
