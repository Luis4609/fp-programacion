package programacion.ejercicios.tema1;

import javax.swing.JOptionPane;

/**
 * @author Vespertino Luis
 *
 */

public class Ejercicios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar las variables
		double ancho;
		double altura;
		double perimetro;
		double area;

		// Abrir cuadros de dialogo
		String anchoRectangulo = JOptionPane.showInputDialog("¿Cuanto es el ancho del rectangulo?",
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("El usuario ha escrito " + anchoRectangulo);

		String alturaRectangulo = JOptionPane.showInputDialog("¿Cuanto es la altura del rectangulo?",
				JOptionPane.QUESTION_MESSAGE);
		System.out.println("El usuario ha escrito " + alturaRectangulo);

		// Convertir anchoRectangulo alturaRectangulo en ancho y altura

		ancho = Double.parseDouble(anchoRectangulo);
		altura = Double.parseDouble(alturaRectangulo);

		// Calcular perimetro y area
		perimetro = 2 * ancho + 2 * altura;
		area = ancho * altura;

		// Valores finales por pantalla
		System.out.print("Perímetro del rectangulo: " + perimetro + " centímetros");
		System.out.print("Área del rectangulo: " + area + " centímetros cuadrados");

	}

}
