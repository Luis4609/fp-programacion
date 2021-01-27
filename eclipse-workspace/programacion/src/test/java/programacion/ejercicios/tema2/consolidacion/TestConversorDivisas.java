package programacion.ejercicios.tema2.consolidacion;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vespertino, Luis Monzon, Tests para la clase de ConversorDivisas
 *
 */
public class TestConversorDivisas {

	/**
	 * Test JUnit para el metodo librasToEuros de la clase ConversorDivisas Test
	 * True
	 */
	@Test
	public void testCambioLibrasToEuros() {

		ConversorDivisas conversor = new ConversorDivisas();

		conversor.librasToEuros(100);

		// Test
		assertEquals(112.0, conversor.getEuros()); // Test de la clase ConversorDivisas DEBERIA SER VALIDO, no es TRUE por la precision de la operacion
		assertTrue(conversor.getEuros() == 112); // Test con assertTrue

	}

	/**
	 * Test Junit para el metodo eurosToLibras de la clase ConversorDivisas Test
	 * True
	 */
	@Test
	public void testCambioEurosToLibras() {

		ConversorDivisas conversor = new ConversorDivisas();

		conversor.eurosToLibras(200);

		// Test
		assertEquals(170, conversor.getLibras()); // Test del metodo eurosToLibras. Es TRUE

	}
}
