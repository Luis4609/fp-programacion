/**
 * 
 */
package programacion.ejercicios.tema4;

/**
 * @author Vespertino Generar tabla de multiplicar del 1-10 por CONSOLA
 */
public class Ejercicio3_5 {

	/**
	 * Generar tabla de multiplicar del 1-10
	 */
	public int generarTabla() {
		int resultado = 0;

		System.out.println();
		for (int i = 1; i <= 10; i++) {

			System.out.print(i + " ");

//			System.out.print(i + " ");

			for (int j = 1; j <= 10; j++) {
//				System.out.print(j);

				System.out.print(" " + (i * j) + " ");
			}
			System.out.println();
		}
		System.out.println();
		return resultado;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ejercicio3_5 tabla = new Ejercicio3_5();

		System.out.print(tabla.generarTabla());

	}

}
