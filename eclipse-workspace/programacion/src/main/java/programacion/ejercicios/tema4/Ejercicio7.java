/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino
 * Ejercicio 7 Coleccio 3
 */
public class Ejercicio7 {

	public String saludoHorario(String nombre, int hora) {

		@SuppressWarnings("unused")
		String saludo;

		if (hora >= 6 && hora < 12) {
			return saludo = "Buenos dias!";
		}
		if (hora >= 12 && hora < 20) {
			return saludo = "Buenas tardes!";
		} else {
			return saludo = "Buenas noches!";
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Objeto Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Tu nombre es:");
		String nombre = sc.nextLine();
		
		System.out.println("La hora del dia es:");
		int hora = sc.nextInt();

		Ejercicio7 horario = new Ejercicio7();

		horario.saludoHorario(nombre, hora);

		sc.close();

		System.out.println(horario.saludoHorario(nombre, hora) + " " + nombre);

	}

}
