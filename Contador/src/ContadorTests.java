import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTests {

	@Test
	public void ponerCero() {
		Contador c = new Contador();
		int res = 0;
		
		assertEquals(res, c.mostrar());
		
	}
	
	@Test
	public void cuentaUno() {
		Contador c = new Contador();
		int res = 1;
		
		c.contar();
		
		assertEquals(res, c.mostrar());
	}
	
	@Test
	public void reiniciarCuenta() {
		Contador c = new Contador();
		int res = 0;
		
		c.contar();
		c.reset();
		
		assertEquals(res, c.mostrar());
	}
	
//	@Test
//	public void cuentaMucho() {
//		Contador c = new Contador();
//
//		for(int i = 0; i < Integer.MAX_VALUE; i++){
//			c.contar();
//		}
//		
//		// assertEquals(Integer.MAX_VALUE, c.mostrar());
//		
//		c.contar();
//		assertEquals((long)Integer.MAX_VALUE+1, c.mostrar());
//	}
}
