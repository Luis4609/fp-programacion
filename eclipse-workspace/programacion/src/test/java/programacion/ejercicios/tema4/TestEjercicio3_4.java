package programacion.ejercicios.tema4;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestEjercicio3_4 {
	
	@Test
	public void testCalcularFactorial() {
		
		Ejercicio3_4 factorial = new Ejercicio3_4();
		
		assertTrue(factorial.calcularFactorial(3) == 6);
	}
	
	/**
	 * Test da como resultado FALSE
	 */
	@Test
	public void testCalcularFactorial3() {
		
		Ejercicio3_4 factorial = new Ejercicio3_4();
		
		assertTrue(factorial.calcularFactorial(5) == 54);
	}
	
	@Test
	public void testCalcularFactorial2() {
		
		Ejercicio3_4 factorial = new Ejercicio3_4();
		
		assertTrue(factorial.factorial(6) == 720);
		
	}

}
