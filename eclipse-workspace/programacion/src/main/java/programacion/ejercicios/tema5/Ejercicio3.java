package programacion.ejercicios.tema5;

/**
 * @author luism Clase para determinar si una sucesion de caracteres es
 *         palindroma Escribir la cadena de caracteres alReves
 */
public class Ejercicio3 {

	/**
	 * @param frase
	 * @return resultado = frase al reves
	 */
	public String fraseAlReves(String frase) {

		String resultado = "";

		if (frase == null) {
			return null;
		} else {

			for (int i = frase.length() - 1; i >= 0; i--) {
				resultado = resultado + frase.charAt(i);
			}

		}

		return resultado;
	}

	/**
	 * @param frase
	 * @return true esPalindroma or false !esPalindroma
	 */
	public boolean esPalindromo(String frase) {

		if (fraseAlReves(frase).equals(frase)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {

		Ejercicio3 frase = new Ejercicio3();
		

		System.out.println(frase.fraseAlReves("Hola"));
		System.out.println(frase.esPalindromo("ana"));
		

	}

}
