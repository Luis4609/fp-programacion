package programacion.ejercicios.tema5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ejercicio8 {

	/**
	 * @return numero aleatorio entre 1-100
	 */
	public int randomNuber() {
		SecureRandom randowNumber = new SecureRandom();
		int randomInt = 1 + randowNumber.nextInt(100);
		return randomInt;
	}

	public static void main(String args[]) {

		SecureRandom randowNumber = new SecureRandom();
		int randomInt = randowNumber.nextInt(100);

		Scanner sc = new Scanner(System.in);

		System.out.println("Adivina un número entre 1 y 100. Tienes 6 intentos");

		for (int i = 0; i < 6; i++) {

			System.out.println("Intento " + (i + 1) + " : ¿Qué numero es ? : ");
			int numUsuario = sc.nextInt();

			if (numUsuario < 1 || numUsuario > 100) {
				System.out.println("El numero introducido es erroneo ");

			} else {

				if (randomInt == numUsuario) {
					System.out.println("¡¡¡Felicidades !!! Acertaste en " + i + " intentos.");
					break;
				} else {
					if (randomInt < numUsuario) {
						System.out.println("Has introducido un número demasiado pequeño ");
					} else {
						System.out.println("Has introducido un número demasiado grande ");
					}
				}

				if (i == 5 && numUsuario != randomInt) {
					System.out.println("Has fallado, tus intentos han acabado");
				}

			}
		}

		sc.close();
	}

}
