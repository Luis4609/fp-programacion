package programacion.ejercicios.tema5;

import java.security.SecureRandom;

public class AlgoritmosOrdenacion {

	static int ordenarBurbuja(int[] lista) {

		int tamano = lista.length;
		int auxiliar;
		int repeticiones = 0;
		for (int i = 0; i <= tamano - 2; i++) {
			for (int j = 0; j <= (tamano - i - 2); j++) {
				if (lista[j] > lista[j + 1]) {
					// intercambiamos los elementos
					auxiliar = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = auxiliar;

				}
				repeticiones++;
			}
		}
		return repeticiones;
	}

	static int ordenarInsercion(int[] lista) {

		int tamano = lista.length;
		int auxiliar, k;
		int repeticiones = 0;
		boolean encontradoHueco;
		for (int i = 0; i <= tamano - 1; i++) {
			auxiliar = lista[i];
			encontradoHueco = false;
			k = i - 1;
			while (k >= 0 && !encontradoHueco) {
				if (lista[k] > auxiliar) {

					lista[k + 1] = lista[k];
					k--;
				} else {
					// hemos de colocar el elemento lista[i en este hueco
					encontradoHueco = true;
				}
				repeticiones++;
			} // fin del bucle mientras
			lista[k + 1] = auxiliar;
		} // fin bucle en i
		return repeticiones;
	} // fin del mÃ©todo

	static void imprimirLista(int[] lista) {
		for (int elem : lista) {
			System.out.println(elem);
		}
	}

	public void generarRandom() {

		SecureRandom secureRandom = new SecureRandom();

		int[] numRandoms = new int[10];

		for (int i = 0; i < 10; i++) {
			int numRandom = secureRandom.nextInt(101);
			numRandoms[i] = numRandom;
			System.out.println(numRandoms[i]);
		}

	}

	public static void main(String[] args) {

		int[] miLista = { 20, 8, 25, 4, 30, 10, 17, 15 };

		int repeticiones = ordenarBurbuja(miLista);
		imprimirLista(miLista);
		System.out.println("Iteraciones del algoritmo  :" + repeticiones);

	}
}
