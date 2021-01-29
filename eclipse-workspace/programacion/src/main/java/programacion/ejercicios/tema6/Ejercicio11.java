package programacion.ejercicios.tema6;

public class Ejercicio11 {

	/**
	 * 
	 * @param dni
	 * @return resultado = letraDNI
	 */
	public char letraNIF(int dni) {

		char resultado = 0;
		int restoDNI = dni % 23;

		int[] arrayResto = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
		char[] arrayCharDNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		for (int i = 0; i < 23; i++) {
			if (restoDNI == arrayResto[i]) {
				resultado = arrayCharDNI[i];
			}
		}

		return resultado;
	}

}
