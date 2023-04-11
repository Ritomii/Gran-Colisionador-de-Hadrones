package unlam.paradigmas.diagnostico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ejercicio02Tests {
	
	@Test
	public void matrizSinCeros() {
		int m[][] = { { 1, 2, 3 }, { 2, 1, 3 } };
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = false;
		assertEquals(esperado,real);
		//free (annihilate)
	}

	@Test
	public void matrizConUnCero() {
		int m[][] = { { 1, 2, 3 }, { 2, 0, 3 } };
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = true;
		assertEquals(esperado,real);
		//free (annihilate)
	}
	
	@Test
	public void matrizVacia() {
		int m[][] = { {} };
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = true;
		assertEquals(esperado,real);
		//free (annihilate)
	}

	@Test
	public void matrizNull() {
		int m[][] = null;
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = true;
		assertEquals(esperado,real);
		//free (annihilate)
	}

	@Test(timeout = 15)
	public void matrizEnorme() {
		int m[][] = new int [1000][10000];
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j++)
			{
				m[i][j] = Integer.MAX_VALUE;
			}
		}
		m[0][0] = 0;
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = true;
		assertEquals(esperado,real);
		//free (annihilate)
	}
	
	@Test
	public void matrizEnormeSinCeros() {
		int m[][] = new int [1000][10000];
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j++)
			{
				m[i][j] = Integer.MAX_VALUE;
			}
		}
		boolean real = Ejercicio02.resolver(m);
		boolean esperado = false;
		assertEquals(esperado,real);
		//free (annihilate)
	}
	 
}
