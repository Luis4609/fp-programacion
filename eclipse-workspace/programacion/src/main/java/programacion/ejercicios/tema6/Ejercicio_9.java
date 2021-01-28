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

		// Crear la apuesta de la Primitiva 6 int
		for (int i = 0; i < 6; i++) {
			numPrimitivaReintegro[i] = randomNuber();

		}

		//Comprobar que no se repite ningun numero
		for (int i = 0; i < 6; i++) {
			for (int j = 5; j >= 0; j--) {
				if (numPrimitivaReintegro[i] == numPrimitivaReintegro[j]) {
					numPrimitivaReintegro[i] = randomNuber();
				}
			}

		}

		// Añadir el reintegro a la Apuesta
		numPrimitivaReintegro[6] = randomReintegro();

		return numPrimitivaReintegro;
	}

	public static void main(String[] args) {

		Ejercicio_9 test = new Ejercicio_9();
		test.apuestaPrimitiva();
		for (int i = 0; i < test.apuestaPrimitiva().length; i++) {
			System.out.println("Primitiva " + test.apuestaPrimitiva()[i]);
		}

	}

}
