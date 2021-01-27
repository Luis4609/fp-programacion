/**
 * 
 */
package programacion.ejercicios.tema2.consolidacion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Vespertino, Luis Monzon, Test para la clase Temperatura
 *
 */
public class TestTemperatura {

	/**
	 * Test JUnit para el metodo celsiusToFarenheit Test true
	 */
	@Test
	public void testCambioCelsiusToFarenheit() {

		Temperatura temp = new Temperatura();

		temp.celsiusToFarenheit(32);

		// Test
		assertEquals(89.6, temp.getGradosFarenheit()); // La temperatura de entreda son 32 ºCelsius = 89.6 ºFarenheit
	}

	/**
	 * Test Junit para el metodo farenheitToCelsius Test false
	 */
	@Test
	public void testCambioFarenheitToCelsius() {

		Temperatura temp = new Temperatura();

		temp.farenheitToCelsius(100);

		// Test
		assertEquals(32.8, temp.getGradosCelsius()); // Segundo test FALLA PORQUE EL VALOR ESPERADO ES 37.777777777778
	}

}
