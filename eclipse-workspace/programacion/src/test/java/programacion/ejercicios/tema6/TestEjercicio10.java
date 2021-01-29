package programacion.ejercicios.tema6;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestEjercicio10 {

	@Test
	public void testLetraDNI() {
		Ejercicio11 test = new Ejercicio11();

		assertTrue(test.letraNIF(13110000) == 'T');
	}

}
