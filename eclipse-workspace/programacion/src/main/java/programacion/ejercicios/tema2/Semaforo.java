/**
 * 
 */
package programacion.ejercicios.tema2;

enum ColorSemaforo {
	ROJO, VERDE, AMBAR;
}

/**
 * @author Vespertino
 * @Clase Semaforo
 * @Atributos colorSemaforo, parpadeo
 *
 */
public class Semaforo {

	private ColorSemaforo colorSemaforo;
	private boolean parpadeo = false;

	public Semaforo(ColorSemaforo colorSemaforo, boolean parpadeo) {
		super();
		this.colorSemaforo = colorSemaforo;
		this.parpadeo = parpadeo;
	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public Semaforo() {
		super();
		colorSemaforo = colorSemaforo.ROJO;
	}

	/**
	 * @return the colorSemaforo
	 */
	public ColorSemaforo getColorSemaforo() {
		return colorSemaforo;
	}

	/**
	 * @param colorSemaforo the colorSemaforo to set
	 */
	public void setColorSemaforo(ColorSemaforo colorSemaforo) {
		this.colorSemaforo = colorSemaforo;
	}

	/**
	 * @return the parpadeo
	 */
	public boolean isParpadeo() {
		return parpadeo;
	}

	/**
	 * @param parpadeo the parpadeo to set
	 */
	public void setParpadeo(boolean parpadeo) {
		this.parpadeo = parpadeo;
	}

	// Consultar la situacion del semaforo
	public void consultaSemaforo() {
		System.out.println("El color del semaforo es: " + getColorSemaforo());
		System.out.println("El parpadeo del semaforo es: " + isParpadeo());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// SituacionInicial del semaforo
		Semaforo inicialSemaforo = new Semaforo();
		inicialSemaforo.setColorSemaforo(ColorSemaforo.ROJO);
		inicialSemaforo.setParpadeo(false);

		// Metodo de consulta de datos del semaforo
		inicialSemaforo.consultaSemaforo();

		inicialSemaforo.setColorSemaforo(ColorSemaforo.AMBAR);
		inicialSemaforo.setParpadeo(false);

		inicialSemaforo.consultaSemaforo();

		// Ejercicio6

		Semaforo semaforo1 = new Semaforo();
		semaforo1.setColorSemaforo(ColorSemaforo.ROJO);
		semaforo1.setParpadeo(false);

		Semaforo semaforo2 = new Semaforo(ColorSemaforo.VERDE, false);

		semaforo1.consultaSemaforo();
		semaforo2.consultaSemaforo();

	}

}
