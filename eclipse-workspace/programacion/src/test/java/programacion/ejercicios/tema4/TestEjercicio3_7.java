package programacion.ejercicios.tema4;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestEjercicio3_7 {

	@Test
	public void calcularMenorArray() {

		Ejercicio3_7 nums = new Ejercicio3_7();

		double[] listaNum = { 1, 3, 5, 6, 6, 7, 4, 3, 2, 34, 2, 523 };

		nums.calcularMenor(listaNum);
		
	}

	@Test
	public void calcularMenorList() {

		Ejercicio3_7 nums = new Ejercicio3_7();

		List<Double> listaNum = new ArrayList<Double>();

		for (int i = 0; i < 21; i++) {
			listaNum.add((double) i);
		}

		nums.calcularMenor(listaNum);
	}

}
