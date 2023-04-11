package unlam.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unlam.circulo.Circulo;

public class CirculoTests {

	@Test
	public void test() {
		double res = 28.2743;
		Circulo c = new Circulo(3);
		
		assertEquals(c.calcularArea(), res, 0.01);
		
	}

}
