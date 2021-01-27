package programacion.ejercicios.tema4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestEjercicio19 {

	@Test
	public void testContadorVocales() {

		Ejercicio19 testContador = new Ejercicio19();

		assertEquals(7, testContador.contadorVocales("Hello darkness my old friend"));
	}

}
