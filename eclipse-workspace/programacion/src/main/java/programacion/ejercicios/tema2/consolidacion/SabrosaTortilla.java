/**
 * 
 */
package programacion.ejercicios.tema2.consolidacion;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author Vespertino, Luis Monzon
 *
 */

public class SabrosaTortilla {

	private int docenasHuevos; // Cantidad de Huevos en docenas
	private double kilosPatatas; // Cantidad de patatas en kilos

	private static Logger logger = LogManager.getLogger(SabrosaTortilla.class);

	/**
	 * @return the docenasHuevos
	 */
	public int getDocenasHuevos() {
		return docenasHuevos;
	}

	/**
	 * @param docenasHuevos the docenasHuevos to set
	 */
	public void setDocenasHuevos(int docenasHuevos) {
		this.docenasHuevos = docenasHuevos;
	}

	/**
	 * @return the kilosPatatas
	 */
	public double getKilosPatatas() {
		return kilosPatatas;
	}

	/**
	 * @param kilosPatatas the kilosPatatas to set
	 */
	public void setKilosPatatas(double kilosPatatas) {
		this.kilosPatatas = kilosPatatas;
	}

	/**
	 * @param docenasHuevos
	 * @param patatas
	 */
	public SabrosaTortilla(int docenasHuevos, double kilosPatatas) {
		super();
		this.docenasHuevos = docenasHuevos;
		this.kilosPatatas = kilosPatatas;
	}

	/**
	 * 
	 */
	public SabrosaTortilla() {
		super();
		// Podemos establecer una situacion inicial para el almacen
		docenasHuevos = 10;
		kilosPatatas = 10;
	}

	/**
	 * Añadir docenas de huevos al almacen
	 * 
	 * @param huevos
	 */
	public void addHuevos(int huevos) {

		docenasHuevos = +huevos;
	}

	/**
	 * Añadir kilos de patatas al almacen
	 * 
	 * @param kilos
	 */
	public void addPatatas(double kilos) {

		kilosPatatas = kilosPatatas + kilos;
	}

	/**
	 * @return true si hayExistencias, flase si !hayExistencias
	 */
	public boolean hayExistencias() {

		if (docenasHuevos != 0 && kilosPatatas != 0) {
			return true;
		}
		return false;

	}

	/**
	 * Restar la cantidad de huevos y patatas que se gastan en hacer una tortilla
	 */
	public void sirveTortilla() {

		// Una tortilla equivale a 6huevos = 0.5 docenas y 0.5 kilos de patatas
		if (hayExistencias() == true) {
			docenasHuevos = 0; // docenasHuevos es int, por lo tanto no podemos restarle 0.5
			kilosPatatas = kilosPatatas - 0.5;
		} else {
//			System.out.println("No hay suficientes existencias");
			throw new RuntimeException("No hay suficientes existencias"); // Capturar la excepcion con un try/catch
																			// cuando ejecute
		}

	}

	/**
	 * @return numeroTotal de huevos, 12 * las docenas
	 */
	public int getHuevos() {

		int huevosTotales = docenasHuevos * 12;
		return huevosTotales;
	}

	/**
	 * @return cantidad de tortillas que se pueden realizar con las existencias en
	 *         el almacen
	 */
	public int carcularTortillas() {

		int totalTortillas; // totalTortillas debe ser entero

		if (hayExistencias() == true) {
			if (getHuevos() / 6 < getKilosPatatas() * 2) {
				totalTortillas = getHuevos() / 6;
			} else {
				totalTortillas = (int) (getKilosPatatas() * 2);
			}
		} else {
			return 0;
		}

		return totalTortillas;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SabrosaTortilla tortilla = new SabrosaTortilla();

		// Añadir productos al almacen
		tortilla.addHuevos(0);
		logger.info("Hay tantas docenas de huevos:  " + tortilla.getDocenasHuevos());
		tortilla.addPatatas(100);
		logger.info("Hay tantos kilos de patatas en el almacen: " + tortilla.getKilosPatatas());

		// Capturar la excepcion de sirveTortilla
		try {
			tortilla.sirveTortilla();
		} catch (RuntimeException e) {
//			System.out.println(e.getMessage()); // Solo imprime si no hay existencias
			logger.error("No hay existencias para hacer una tortilla");
		}

	}

}
