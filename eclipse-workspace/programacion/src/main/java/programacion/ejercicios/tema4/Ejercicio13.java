/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class Ejercicio13 {

	int resultado;

	public int numeroMayor(int num, int num1, int num2) {

		if (num > num1) {
			resultado = num;
		} else {
			resultado = num1;
		}
		if (resultado < num2) {
			resultado = num2;
		} else {
			return resultado;
		}

		return resultado;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("El primer numero es:");
		int num = sc.nextInt();

		System.out.println("El segundo numero es:");
		int num2 = sc.nextInt();

		System.out.println("El tercer numero es:");
		int num3 = sc.nextInt();

		sc.close();

		Ejercicio13 testNumeroMayor = new Ejercicio13();

		testNumeroMayor.numeroMayor(num, num2, num3);

		System.out.println("El numero mayor es: " + testNumeroMayor.numeroMayor(num, num2, num3));

	}

}
