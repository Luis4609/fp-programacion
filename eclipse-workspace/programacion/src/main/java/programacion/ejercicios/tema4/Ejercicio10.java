/**
 * 
 */
package programacion.ejercicios.tema4;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class Ejercicio10 {

	double resultado;

	// Logica para calcular el salioFinal
	public double calcularSalarioFinal(double salarioInicial) {

		if (salarioInicial <= 1000) {
			resultado = salarioInicial * 0.2 + salarioInicial;
		}
		if (salarioInicial > 1000 && salarioInicial <= 1800) {
			resultado = salarioInicial * 0.15 + salarioInicial;
		} else {
			resultado = salarioInicial + 0.1 + salarioInicial;
		}

		return resultado;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejercicio10 test = new Ejercicio10();
		Scanner sc = new Scanner(System.in);
		double salarioInicial = sc.nextDouble();

		test.calcularSalarioFinal(salarioInicial);

		sc.close();

		System.out.println("El salario final es: " + test.resultado);

	}

}
