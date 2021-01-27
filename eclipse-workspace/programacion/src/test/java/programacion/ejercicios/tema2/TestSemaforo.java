/**
 * 
 */
package programacion.ejercicios.tema2;

/**
 * @author Vespertino
 *
 */
public class TestSemaforo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Semaforo testSemaforo = new Semaforo();
		testSemaforo.setColorSemaforo(ColorSemaforo.ROJO);

		testSemaforo.consultaSemaforo();

		testSemaforo.setColorSemaforo(ColorSemaforo.AMBAR);
		testSemaforo.consultaSemaforo();

	}

}
