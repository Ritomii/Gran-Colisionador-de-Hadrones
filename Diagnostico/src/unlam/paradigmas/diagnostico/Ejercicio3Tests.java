import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Ejercicio3Tests {

	@Test
	public void ejemploDado() {
		int m[][] = {
				{8,2,-3,4},
				{5,-6,-6,20},
				{21,1,-5,0}
		};
		int res[][] = {
				{15,1,-3,21},
				{28,-4,0,18},
				{27,11,-10,15}
		};
		
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));
	}
	
	@Test
	public void elementoUnico() {
		int m[][] = {{5}};
		
		int res[][] = {{5}};
		
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));
	}
	
	@Test
	public void dosFilasColumnas() {
		int m[][] = {
				{3,4},
				{7,-2}
		};
		int res[][] = {
				{14,5},
				{8,9}
		};
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));		
	}
	
	@Test
	public void filaUnica() {
		int m[][] = {{1,2,3,4}};
		int res[][] = {{3,6,9,7}};
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));		
	}
	
	@Test
	public void columnaUnica() {
		int m[][] = {
				{0},
				{7},
				{-3},
				{2}
		};
		int res[][] = {
				{7},
				{4},
				{6},
				{-1}
		};
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));
	}
	
	
	public void filasTamVariable() {
		int m[][] = {
				{1,2,3,4},
				{1,4},
				{1,2,3},
				{4}
		};
		
		int res[][] = {
				{4,10,9,7},
				{7,9},
				{8,10,5},
				{5}
		};
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));
	}
	
	@Test
	public void matrizLarga() {
		int m[][] = new int[100][100];
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
				m[i][j] = 1;
		
		int res[][] = new int[100][100];
		res[0][0] = 3;
		res[0][99] = 3;
		res[99][0] = 3;
		res[99][99] = 3;
		for(int i=1;i<99;i++)
			res[0][i] = 4;
		for(int i=1;i<99;i++)
			res[i][0] = 4;
		for(int i=1;i<99;i++)
			res[99][i] = 4;
		for(int i=1;i<99;i++)
			res[i][99] = 4;
		for(int i=1;i<99;i++)
			for(int j=1;j<99;j++)
				res[i][j] = 5;
		
		assertArrayEquals(res, Ejercicio3.sumaAdyacentes1(m));
	}
	
}
