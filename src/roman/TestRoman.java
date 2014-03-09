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
		roman = new Roman("VI");
		assertThat(roman.intValue(), is(6));
	}

	@Test
	public void viiShouldBeSeven() {
		roman = new Roman("VII");
		assertThat(roman.intValue(), is(7));
	}

	@Test
	public void viiiShouldBeEight() {
		roman = new Roman("VIII");
		assertThat(roman.intValue(), is(8));
	}

	@Test
	public void ixShouldBeNine() {
		roman = new Roman("IX");
		assertThat(roman.intValue(), is(9));
	}

	@Test
	public void xShouldBeTen() {
		roman = new Roman("X");
		assertThat(roman.intValue(), is(10));
	}

	@Test
	public void xiShouldBeEleven() {
		roman = new Roman("XI");
		assertThat(roman.intValue(), is(11));
	}

	@Test
	public void xiiShouldBeTwelve() {
		roman = new Roman("XII");
		assertThat(roman.intValue(), is(12));
	}

	@Test
	public void xiiiShouldBeThirteen() {
		roman = new Roman("XIII");
		assertThat(roman.intValue(), is(13));
	}

	@Test
	public void xxxiShouldBeThirtyOne() {
		roman = new Roman("XXXI");
		assertThat(roman.intValue(), is(31));
	}

}
