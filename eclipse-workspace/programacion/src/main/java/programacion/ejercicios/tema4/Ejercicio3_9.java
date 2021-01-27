/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class Ejercicio3_9 {

	public void dibujaTriangulo(int num) {

		// Bucle para generar el dibujo deseado
		for (int i = num; i > 0; i--) {
			// Espacios en blanco
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public boolean verificarArgumento(int n) {
		if (n < 50 && n % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Escribir por consola el num de Filas
		System.out.print("Introduzca numero de filas: ");
		int numFilas = sc.nextInt();
		sc.close();

		// Objeto Ejercicio 3_9
		Ejercicio3_9 testDibujo = new Ejercicio3_9();

		testDibujo.dibujaTriangulo(numFilas);

	}
}
