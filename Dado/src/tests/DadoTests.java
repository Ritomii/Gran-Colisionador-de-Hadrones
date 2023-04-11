package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import dado.Dado;

public class DadoTests {

	@Test
	public void dado6Caras() {
		Dado d = new Dado(6);

		for (int i = 0; i < 60; i++) {
			int lanzada = d.lanzarDado();
			boolean res = lanzada >= 1 && lanzada <= 6;
			assertTrue(res);
		}

	}

	@Test
	public void dadoXCaras() {
		int x = 12;
		Dado d = new Dado(x);

		for (int i = 0; i < 100; i++) {
			int lanzada = d.lanzarDado();
			boolean res = lanzada >= 1 && lanzada <= x;
			assertTrue(res);
		}
	}

	@Test
	public void idealProbable(){
		Dado d = new Dado();
		int[] v = new int[7];
		for (int i = 0; i < 1000000; i++) {
			v[d.lanzarDado()]++;
		}
		
		int ideal = 1000000 / 6;
		
		for (int i = 1; i < v.length; i++) {
			assertTrue(Math.abs(v[i] - ideal) <= (0.01*1000000));
		}
	}
}
