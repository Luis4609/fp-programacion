/**
 * 
 */
package programacion.ejercicios.tema4;

/**
 * @author Vespertino
 *
 */
public class Ejercicio20 {

	/**
	 * @param ano
	 * @return true = añoBisiesto false = !añoBisiesto
	 */
	public boolean isBisiesto(int ano) {

		boolean bisiesto = false;

		if (ano % 400 == 0) {
			return bisiesto = true;
		} else {

			if (ano % 4 == 0 && ano % 100 != 0) {
				return bisiesto = true;
			}
		}
		return bisiesto;
	}

}
