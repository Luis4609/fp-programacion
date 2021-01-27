/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino Ejercicio 2 Coleccion 3 Pasar de celsiusAFarenheit
 */
public class Ejercicio2 {

	/**
	 * @param grado = grados Celsius para convertir en Farenheit
	 * @return resultado = el valor de grados en Farenheit despues de recibir grados
	 *         Celsius
	 */
	public double celsiusToFarenheit(double grado) {

		double resultadoCelsiusToFarenheit = (grado * 1.8 + 32); // Formula para pasar de Celsius a Farenheit
		return resultadoCelsiusToFarenheit;
	}

	/**
	 * @param grado = grados Farenheit para convertir en Celsius
	 * @return resultado = el valor de grados Celsius despues de recibir grados
	 *         Farenheit
	 */
	public double farenheitToCelsius(double grado) {

		double resultadoFarenheitToCelsius = (grado - 32) / 1.8; // Formula para pasar de Farenheit a Celsius
		return resultadoFarenheitToCelsius;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Preguntar por pantalla 
		System.out.println("La temperatura que desea convertir:");
		Scanner sc = new Scanner(System.in);
		double gradoEntrada = sc.nextDouble();

		System.out.println("Identificador de temp:");
		char identificadorTemp = sc.next().charAt(0);

		Ejercicio2 testTemperatura = new Ejercicio2();

		double tempFinal = 0;

		if (identificadorTemp == 'C') {
			tempFinal = testTemperatura.celsiusToFarenheit(gradoEntrada);
			System.out.println("La temperatura final:" + tempFinal);

		} if(identificadorTemp == 'F') {
			tempFinal = testTemperatura.farenheitToCelsius(gradoEntrada);
			System.out.println("La temperatura final:" + tempFinal);
		}else {
			  System.out.println("La escala de temp es incorrecta");
		}

		sc.close();

		

	}

}
