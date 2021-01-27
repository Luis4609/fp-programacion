/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.List;

/**
 * @author luism
 *
 */
public class Ejercicio3_7 {

	public double calcularMenor(double[] listaNum) {

		double menor = listaNum[0];
		for (int i = 0; i < listaNum.length; i++) {

			if (listaNum[i] < menor) { // Index out of bounds
				menor = listaNum[i];
			}
		}
		return menor;
	}

	public double calcularMenor(List<Double> listaNum) {

		double min = listaNum.get(0);

		for (int i = 0; i < listaNum.size(); i++) {
			if (min < listaNum.get(i)) {
				min = listaNum.get(i);
			}

		}

		return min;
	}

}
