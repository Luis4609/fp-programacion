/**
 * 
 */
package programacion.ejercicios.tema2.consolidacion;

/**
 * @author Vespertino, Luis Monzon
 * @apiNote Convertir de grados Celsius a Farenheit, Convertir de grados
 *          Farenheit a Celsius
 */
public class Temperatura {

	private double gradosCelsius;
	private double gradosFarenheit;

	/**
	 * @param gradosCelsius
	 * @param gradosFarenheit
	 */
	public Temperatura(double gradosCelsius, double gradosFarenheit) {
		super();
		this.gradosCelsius = gradosCelsius;
		this.gradosFarenheit = gradosFarenheit;
	}

	/**
	 * Constructor vacio
	 */
	public Temperatura() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the gradosCelsius
	 */
	public double getGradosCelsius() {
		return gradosCelsius;
	}

	/**
	 * @param gradosCelsius the gradosCelsius to set
	 */
	public void setGradosCelsius(double gradosCelsius) {
		this.gradosCelsius = gradosCelsius;
	}

	/**
	 * @return the gradosFarenheit
	 */
	public double getGradosFarenheit() {
		return gradosFarenheit;
	}

	/**
	 * @param gradosFarenheit the gradosFarenheit to set
	 */
	public void setGradosFarenheit(double gradosFarenheit) {
		this.gradosFarenheit = gradosFarenheit;
	}

	/**
	 * @param grado = grados Celsius para convertir en Farenheit
	 * @return resultado = el valor de grados en Farenheit despues de recibir grados
	 *         Celsius
	 */
	public void celsiusToFarenheit(double grado) {

		double resultadoCelsiusToFarenheit = (grado * 1.8 + 32); // Formula para pasar de Celsius a Farenheit
		setGradosFarenheit(resultadoCelsiusToFarenheit);
	}

	/**
	 * @param grado = grados Farenheit para convertir en Celsius
	 * @return resultado = el valor de grados Celsius despues de recibir grados
	 *         Farenheit
	 */
	public void farenheitToCelsius(double grado) {

		double resultadoFarenheitToCelsius = (grado - 32) / 1.8; // Formula para pasar de Farenheit a Celsius
		setGradosCelsius(resultadoFarenheitToCelsius);
	}

	/**
	 * Metodo para mostrar por pantalla el resultado
	 */
	public void mostrarResultado() {

		System.out.println("La temperatura en grados Celsius: " + getGradosCelsius());
		System.out.println("La temperatura en grados Farenheit: " + getGradosFarenheit());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos objeto Temperatura
		Temperatura temp = new Temperatura();

		// Llamamos a los metodos para convertir temperaturas
		temp.celsiusToFarenheit(32);
		temp.farenheitToCelsius(100);

		// Mostrar resultado
		temp.mostrarResultado();

	}

}
