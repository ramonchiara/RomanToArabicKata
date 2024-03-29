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

	@Test
	public void xxivShouldBeTwentyFour() {
		roman = new Roman("XXIV");
		assertThat(roman.intValue(), is(24));
	}

	@Test
	public void xlShouldBeFourty() {
		roman = new Roman("XL");
		assertThat(roman.intValue(), is(40));
	}

	@Test
	public void lShouldBeFifty() {
		roman = new Roman("L");
		assertThat(roman.intValue(), is(50));
	}

	@Test
	public void lxShouldBeSixty() {
		roman = new Roman("LX");
		assertThat(roman.intValue(), is(60));
	}

	@Test
	public void lxxShouldBeSeventy() {
		roman = new Roman("LXX");
		assertThat(roman.intValue(), is(70));
	}

	@Test
	public void lxxxShouldBeEighty() {
		roman = new Roman("LXXX");
		assertThat(roman.intValue(), is(80));
	}

	@Test
	public void cShouldBeOneHundred() {
		roman = new Roman("C");
		assertThat(roman.intValue(), is(100));
	}

	@Test
	public void xcShouldBeNinety() {
		roman = new Roman("XC");
		assertThat(roman.intValue(), is(90));
	}

	@Test
	public void ccclxixShouldBeThreeHundredAndSixtyNine() {
		roman = new Roman("CCCLXIX");
		assertThat(roman.intValue(), is(369));
	}

	@Test
	public void dShouldBeFiveHundred() {
		roman = new Roman("D");
		assertThat(roman.intValue(), is(500));
	}

	@Test
	public void cdShouldBeFourHundred() {
		roman = new Roman("CD");
		assertThat(roman.intValue(), is(400));
	}

	@Test
	public void cdxlviiiShouldBeFourHundred() {
		roman = new Roman("CDXLVIII");
		assertThat(roman.intValue(), is(448));
	}

	@Test
	public void mShouldBeOneThousand() {
		roman = new Roman("M");
		assertThat(roman.intValue(), is(1000));
	}

	@Test
	public void mcmxcviiiShouldBeOneThousand() {
		roman = new Roman("MCMXCVIII");
		assertThat(roman.intValue(), is(1998));
	}

	@Test
	public void mmdccliShouldBeOneThousand() {
		roman = new Roman("MMDCCLI");
		assertThat(roman.intValue(), is(2751));
	}

}
