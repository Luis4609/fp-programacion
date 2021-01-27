package programacion.ejercicios.tema6;

import java.security.SecureRandom;

public class Ejercicio_9 {

	/**
	 * @return numPrimitiva, un numero para la primitiva
	 */
	public int randomNuber() {
		SecureRandom randowNumber = new SecureRandom();
		int numPrivitiva = 1 + randowNumber.nextInt(49);
		return numPrivitiva;
	}

	/**
	 * @return reintegro
	 */
	public int randomReintegro() {
		SecureRandom randowNumber = new SecureRandom();
		int reintegro = 1 + randowNumber.nextInt(9);
		return reintegro;
	}

	/**
	 * Calcular 6 int aleatorios entre 1 - 49 + 1 int entre 1 - 9
	 * 
	 * @return array de enteros
	 */
	public int[] apuestaPrimitiva() {

		int[] numPrimitivaReintegro = new int[7];

		for (int i = 0; i < 6; i++) {
			numPrimitivaReintegro[i] = randomNuber();
		}

		numPrimitivaReintegro[6] = randomReintegro();

		return numPrimitivaReintegro;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
