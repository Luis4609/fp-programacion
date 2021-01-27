/**
 * 
 */
package programacion.ejercicios.tema1;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class EjercicioAmpliacion1 {
	public static void main(String[] args) {
		// Declarar las variables
		double ipc = 2.2833; // IPC anual
		double dinero;
		int numeroAnos;
		double resultado;

		// Abrir el objeto scanner para pedir datos por teclado
		Scanner reader = new Scanner(System.in);

		// Pedir al usuario el valor que desea calcular

		System.out.println("¿Cantidad de dinero de la cual desea calcular la devaluacion: ");
		dinero = reader.nextInt();

		System.out.println("¿Número de años que desea predecir: ");
		numeroAnos = reader.nextInt();
		
		reader.close();

		// Calcular el resultado

		resultado = dinero / (Math.pow((1 + ipc) / 100, numeroAnos));

		System.out.println("El resultado del la devaluacion al cabo de " + numeroAnos + " es: " + resultado);

	}
}
