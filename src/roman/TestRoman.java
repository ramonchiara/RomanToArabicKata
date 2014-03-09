package roman;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestRoman {

	@Test
	public void iShouldBeOne() {
		Roman roman = new Roman("I");
		int value = roman.intValue();
		assertThat(value, is(1));
	}
	
	@Test
	public void iiShouldBeTwo() {
		Roman roman = new Roman("II");
		int value = roman.intValue();
		assertThat(value, is(2));
	}

}
