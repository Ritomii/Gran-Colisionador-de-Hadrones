package unlam.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.corona.Corona;

public class CoronaTest {

	@Test
	public void Radio3() {
		Corona coro = new Corona(1,3);
		double res = 25.1327;
		assertEquals(res, coro.calcularArea(), 0.01);
	}

}
