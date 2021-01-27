/**
 * 
 */
package programacion.ejercicios.tema4;

/**
 * @author Vespertino, Ejercicio 19 Coleccion 3, Queremos saber cuántas vocales
 *         existen en una frase en inglés introducida por teclado. Diseñar un
 *         algoritmo que realice este cálculo
 */
public class Ejercicio19 {

	public int contadorVocales(String frase) {

		String contarFrase = frase.toUpperCase();

		int contadorVocales = 0;

		for (int i = 0; i < contarFrase.length(); i++) {
			if (contarFrase.charAt(i) == 'A' || contarFrase.charAt(i) == 'E' || contarFrase.charAt(i) == 'I'
					|| contarFrase.charAt(i) == 'O' || contarFrase.charAt(i) == 'U') {
				contadorVocales++;
			}
		}
		return contadorVocales;  
	}
	
}
