/**
 * 
 */
package programacion.ejercicios.tema1;

import java.util.Scanner;

/**
 * @author Vespertino
 *
 */
public class Ejercicio16 {

	public static void main(String[] args) {

		// Declaracion de variables
		double precioArticulo;
		double margenEsperado;
		double ivaAplicado;

		Scanner reader = new Scanner(System.in);
		
		//Dialogo para obtener los valores 

		System.out.println("Dime el precio inicial del articulo: ");
		precioArticulo = reader.nextDouble();
		
		//System.err.print("Has puesto un precio invalido");   //Mostrar un error por pantalla

		System.out.println("Dime el margen de beneficio que deseas obtener en porcentaje:  ");
		margenEsperado = reader.nextDouble();

		System.out.println("¿Que tipo de IVA hay que aplicar al articulo: ");
		ivaAplicado = reader.nextDouble();

		reader.close();

		// Operaciones para calcular el precio de venta para obtener los beneficios
		// esperados.

		double porcentaje = precioArticulo * (margenEsperado / 100);
		double porcentaje1 = (precioArticulo + porcentaje) * (ivaAplicado / 100);
		double porcentaje2 = porcentaje1 + porcentaje + precioArticulo;

		System.out.println("Precio inicial del artículo " + precioArticulo + " euros");
		System.out.println("Precio al que debes venderlo para obtener el beneficio esperado: " + porcentaje2);

	}

}
