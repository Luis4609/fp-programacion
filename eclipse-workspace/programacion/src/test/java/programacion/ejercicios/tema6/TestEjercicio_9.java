package programacion.ejercicios.tema6;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TestEjercicio_9 {

	@Test
	public void testApuestaPrimitiva() {

		Ejercicio_9 testApuesta = new Ejercicio_9();

		int[] testArray = new int[7];
		testArray = testApuesta.apuestaPrimitiva();

		// Comprobar que cada numero de la apuesta es distinto a los demas

		for (int i = 0; i < 6; i++) {
			for (int j = 6; j >= 0; j--) {
				assertTrue(testArray[i] != testArray[j]);
			}

		}

	}

}
