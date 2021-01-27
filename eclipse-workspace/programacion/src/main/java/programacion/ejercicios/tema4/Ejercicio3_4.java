/**
 * 
 */
package programacion.ejercicios.tema4;

/**
 * @author Vespertino
 *
 */
public class Ejercicio3_4 {

	/**
	 * Metodo para calcular el factorial de n usando FOR
	 * 
	 * @param n
	 * @return resultadoFactorial
	 */
	public int calcularFactorial(int n) {

		int resultadoFactorial = 0;

		if (n == 0) {
			return resultadoFactorial = 1;
		} else {
			for (int i = n; i > 0; i--) {
				resultadoFactorial = resultadoFactorial + i;

			}
		}

		return resultadoFactorial;
	}

	/**
	 * Metodo recursivo para calcular el FACTORIAL DE N
	 * 
	 * @param n
	 * @return
	 */
	public int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}
