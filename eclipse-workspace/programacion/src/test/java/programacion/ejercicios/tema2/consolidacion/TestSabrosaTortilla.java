package programacion.ejercicios.tema2.consolidacion;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vespertino, Luis Monzon, Tests para la clase SabrosaTortilla
 *
 */
public class TestSabrosaTortilla {

	/**
	 * Incremente el numero de huevos en docenas
	 */
	@Test
	public void testAddHuevos() {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		tortilla.addHuevos(4);

		// Test true
		assertEquals(4, tortilla.getDocenasHuevos());
	}

	/**
	 * Incrementar el numero de Kilos de patatas
	 */
	@Test
	public void testAddPatatas() {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		tortilla.addPatatas(30); // Añadir 30k de patatas

		// Test true
		assertEquals(40, tortilla.getKilosPatatas()); // La situacion inicial del almacen es de 10K de patatas

	}

	/**
	 * True si quedan huevos y papatas para 1TORTILLA
	 */
	@Test
	public void testHayExistencias() {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		assertTrue(tortilla.getHuevos() >= 6 && tortilla.getKilosPatatas() > 0.5); // True si hay productos para una
																					// tortilla
	}

	/**
	 * Reducir la cantidad de huevos y patatas 6 Huevos y 0.5K por tortilla
	 */
	@Test
	public void testSirveTortilla() {

		// Hay existencias
		SabrosaTortilla omelete = new SabrosaTortilla();

		omelete.addHuevos(32);
		omelete.addPatatas(90);

		omelete.sirveTortilla();

		// Test con existencias
//		assertTrue(omelete.hayExistencias() == true);
		assertEquals(99.5, omelete.getKilosPatatas());

	}

	/**
	 * Get huevos totales, no en docenas
	 */
	@Test
	public void testGetHuevos() {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		tortilla.addHuevos(5);

		// Test
		assertEquals(60, tortilla.getHuevos());
	}

	@Test
	public void testCalcularTortilla() {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		// Test
		assertEquals(20, tortilla.carcularTortillas()); 
	}
}
