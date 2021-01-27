/**
 * 
 */
package programacion.ejercicios.tema3;

import java.util.Scanner;

/**
 * @author Vespertino Algoritmo para identificar el mayor entre 3 numeros
 */
public class Ejercicio13 {

	int resultado;

	// Algoritmo para encontrar el numero mayor
	// if(num > num1){
//	resultado = num;
//	if(resultado < num2) {
//		resultado = num2
//	}else {
//		return resultado;
//	}

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

	public int numeroMayorBucle(int num, int num1, int num2, int num3) {

		boolean esMayor = false;

		while (!esMayor) {
			if (num > num1) {
				resultado = num;
			} else {
				resultado = num1;
			}

		}

		int intArray[] = new int[4];
		intArray[0] = num;
		intArray[1] = num1;
		intArray[2] = num2;
		intArray[3] = num3;

		int resultado1 = intArray[0];

		for (int i = 0; i <= intArray.length; i++) {

			if (resultado1 < intArray[i + 1]) {
				resultado1 = intArray[i + 1];  //CREO QUE LA I AUMENTA DOS VECES
			} 

		}
		return resultado1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer numero");
		int num = sc.nextInt();
		System.out.println(num);

		System.out.print("Introduce el primer numero");
		int num1 = sc.nextInt();
		System.out.println(num1);

		System.out.print("Introduce el primer numero");
		int num2 = sc.nextInt();
		System.out.println(num2);

		sc.close();

	}

}
