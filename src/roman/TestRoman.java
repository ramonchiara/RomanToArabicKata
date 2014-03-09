package roman;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestRoman {

	private Roman roman;

	@Test
	public void iShouldBeOne() {
		roman = new Roman("I");
		assertThat(roman.intValue(), is(1));
	}

	@Test
	public void iiShouldBeTwo() {
		roman = new Roman("II");
		assertThat(roman.intValue(), is(2));
	}

	@Test
	public void iiiShouldBeThree() {
		roman = new Roman("III");
		assertThat(roman.intValue(), is(3));
	}

	@Test
	public void ivShouldBeFour() {
		roman = new Roman("IV");
		assertThat(roman.intValue(), is(4));
	}

	@Test
	public void vShouldBeFive() {
		roman = new Roman("V");
		assertThat(roman.intValue(), is(5));
	}

	@Test
	public void viShouldBeSix() {
		roman = new Roman("V");
		assertThat(roman.intValue(), is(6));
	}

}
