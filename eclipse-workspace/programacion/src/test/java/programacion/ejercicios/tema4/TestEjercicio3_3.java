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
public class TestEjercicio3_3 {

	// TEST METODO validarFecha(ano, mes, dia)
	@Test
	public void testFechaNotValidaAnoZero() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(0, 3, 3) == true);

	}

	@Test
	public void testFechaNotValidaAno() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(10000, 10, 15) == false);

	}

	@Test
	public void testFechaNotValidaMes() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(2000, 43, 15) == false);

	}

	@Test
	public void testFechaNotValidaDia() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(1000, 10, 50) == false);

	}

	@Test
	public void testFechaValida() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(2000, 10, 15) == true);
	}

	@Test
	public void testFechaValidaFalse() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(1987, 15, 15) == false);
	}

	/**
	 * Noviembre no tiene 31 Dias
	 */
	@Test
	public void testFechaValidaFalseDiaMes() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(1987, 11, 31) == false);
	}

	@Test
	public void testFechaValidaFalseFebreroValido() {

//		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(1987, 2, 28) == true);
	}

	@Test
	public void testFechaValidaFalseFebreroNotValido() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(1987, 2, 31) == false);
	}

	@Test
	public void testFechaValidaFalseFebreroBisiesto() {

		new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(2000, 2, 29) == true);
	}

	@Test
	public void testFechaValidaFalseFebreroBisiestoNotValido() {

		assertTrue(Ejercicio3_3.validarFecha(2000, 2, 31) == false);
	}

	@Test
	public void testFechaValidaFalseFebreroNoBisiestoFalseNotValido() {

		assertTrue(Ejercicio3_3.validarFecha(2001, 2, 29) == false);
	}

	@Test
	public void testFechaValidaFalseFebreroNoBisiestoFalseValido() {

//		Ejercicio3_3 testFechaValida = new Ejercicio3_3();

		assertTrue(Ejercicio3_3.validarFecha(2001, 2, 28) == true);
	}

	// TEST METODO validarFecha(objeto)
	@Test
	public void testFechaValidaObjeto() {

		Ejercicio3_3 testFechaValida = new Ejercicio3_3();
		Ejercicio3_3 testFechaValida2 = new Ejercicio3_3();
		testFechaValida2.setAno(2001);
		testFechaValida2.setMes(5);
		testFechaValida2.setDia(27);

//		 
		assertTrue(testFechaValida.validarFechaNew(testFechaValida2) == false);
//		assertTrue(testFechaValida2.getAno() == 1000);
	}

}
