/**
 * 
 */
package programacion.ejercicios.tema4;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author Vespertino
 *
 */
public class TestEjercicio20 {
	
	@Test
	public void testIsNotBisiesto() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(350) == false);
	}
	
	@Test
	public void testLess400AndBisiesto() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(200) == false);
	}
	
	@Test
	public void testIsBisiesto() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(2000) == true);
	}
	
	@Test
	public void testPlus400AndNotBisiesto() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(1987) == false);
	}
	
	@Test
	public void testNotBisiestoLess400() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(3245) == false);
	}
	
	@Test
	public void testPlus400Bisiesto() {
		
		Ejercicio20 testAno = new Ejercicio20();
		
		assertTrue(testAno.isBisiesto(2012) == true);
	}
	
	

}
