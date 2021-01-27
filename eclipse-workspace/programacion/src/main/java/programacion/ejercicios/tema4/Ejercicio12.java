/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class Ejercicio12 {

	String frase;

	int billetes[] = { 5, 10, 20, 50, 100, 200, 500 };

	public String billete(int ifBillete) {

		switch (ifBillete) {
		case 5:
			System.out.println("Cinco euros");

			break;
		case 10:
			System.out.println("10 euros");

			break;

		case 20:
			System.out.println("20 euros");

			break;

		case 50:
			System.out.println("50 euros");

			break;

		case 100:
			System.out.println("100 euros");

			break;

		case 200:
			System.out.println("200 euros");

			break;

		case 500:
			System.out.println("500 euros");

			break;

		}

		return frase;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ejercicio12 testEjer = new Ejercicio12();

		Scanner sc = new Scanner(System.in);
		int dineros = sc.nextInt();

		testEjer.billete(dineros);

		sc.close();

	}

}
