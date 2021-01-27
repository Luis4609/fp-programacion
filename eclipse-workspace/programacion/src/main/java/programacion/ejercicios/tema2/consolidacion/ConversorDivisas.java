/**
 * 
 */
package programacion.ejercicios.tema2.consolidacion;

/**
 * @author Vespertino ConversorDivisas, clase para convertir de libra en euros y
 *         viceversa
 */
public class ConversorDivisas {

	private double euros;
	private double libras;

	/**
	 * @return the euros
	 */
	public double getEuros() {
		return euros;
	}

	/**
	 * @param euros the euros to set
	 */
	public void setEuros(double euros) {
		this.euros = euros;
	}

	/**
	 * @return the libras
	 */
	public double getLibras() {
		return libras;
	}

	/**
	 * @param libras the libras to set
	 */
	public void setLibras(double libras) {
		this.libras = libras;
	}

	/**
	 * Constructor para establecer el tipo de cambio
	 */
	public ConversorDivisas() {
		super();
		// Tipo de cambio euro = 0,85 libras
		libras = 0.85 * euros;

	}

	/**
	 * @param euros
	 * @param libras
	 */
	public ConversorDivisas(double euros, double libras) {
		super();
		this.euros = euros;
		this.libras = libras;
	}

	/**
	 * @param libras para convertir en euros
	 * 
	 */
	public void librasToEuros(double libras) {

		double resultadoLibrasToEuros = libras * 1.12;
		setEuros(resultadoLibrasToEuros);
	}

	/**
	 * @param euros para convertir en libras
	 * 
	 */
	public void eurosToLibras(double euros) {

		double resultadoEurosToLibras = euros * 0.85;
		setLibras(resultadoEurosToLibras);
	}
	
	public void mostrarResultado() {
		
		System.out.println("La cantidad de dinero converitido es" + getEuros());
		System.out.println("La cantidad de dinero converitido es" + getLibras());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConversorDivisas conversor = new ConversorDivisas();
		
		conversor.librasToEuros(100);
		conversor.eurosToLibras(300);
		
		conversor.mostrarResultado();

	}

}
