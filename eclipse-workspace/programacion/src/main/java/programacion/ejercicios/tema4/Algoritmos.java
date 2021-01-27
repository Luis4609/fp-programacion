/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author luism
 *
 */
public class Algoritmos {

	// Algoritmo Ejercicio 3
	// Pasar grado por pantalla
	Scanner sc = new Scanner(System.in);
	Double grado = sc.nextDouble();

	public double celsiusToFarenheit(double grado) {

		double resultadoCelsiusToFarenheit = (grado * 1.8 + 32); // Formula para pasar de Celsius a Farenheit
		sc.close();
		return resultadoCelsiusToFarenheit;
	}

	

	/**
	 * Algoritmo Ejercicio 5
	 * @param precioInicial
	 * @param rebaja
	 * @return precioRebajado = Precio final despues de aplicar la rebaja
	 */
	public double calcularPrecioRebajado(double precioInicial, double rebaja) {

		// Calcular el precio final del producto despues de la rebaja
		double precioRebajado = precioInicial * (1 - rebaja / 100);
		
	

		return precioRebajado;
	}
	
	

}
