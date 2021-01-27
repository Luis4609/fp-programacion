/**
 * 
 */
package programacion.ejercicios.tema2;

/**
 * @author Vespertino, Luis Monzon
 *
 */

public class Reloj {

	private int hora;
	private int min;
	private int seg;

	/**
	 * Constructor para recibir los parametros en formato militar
	 * 
	 * @param hora
	 * @param min
	 * @param seg
	 */
	public Reloj(int hora, int min, int seg) {
		super();
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	/**
	 * Hora inicial 00:00:00
	 */
	public Reloj() {
		super();
		hora = 0;
		min = 0;
		seg = 0;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the seg
	 */
	public int getSeg() {
		return seg;
	}

	/**
	 * @param seg the seg to set
	 */
	public void setSeg(int seg) {
		this.seg = seg;
	}

	/**
	 * Metodo que implementa una forma de mostrar la hora por pantalla.
	 */
	public void mostrarReloj() {
		System.out.println("Son las " + getHora() + " horas, " + getMin() + " minutos, " + getSeg() + " segundos.");
	}

	/**
	 * Metodo para actualizar hora y min del reloj
	 * 
	 * @param actualHora
	 * @param actualMin
	 */
	public void setHoraMin(int actualHora, int actualMin) {
		setHora(actualHora);
		setMin(actualMin);
		setSeg(0);
	}

	/**
	 * Metodo para actualizar hora, min y seg del reloj
	 * 
	 * @param actualHora
	 * @param actualMin
	 * @param actualSeg
	 */
	public void setHoraMinSeg(int actualHora, int actualMin, int actualSeg) {
		setHora(actualHora);
		setMin(actualMin);
		setSeg(actualSeg);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Reloj 1
		Reloj reloj = new Reloj();

		reloj.mostrarReloj();

		reloj.setHoraMin(15, 25);
		reloj.mostrarReloj();

		// Reloj 2
		Reloj reloj2 = new Reloj();

		reloj2.setHoraMinSeg(18, 50, 14);
		reloj2.mostrarReloj();

		reloj2.setHoraMinSeg(14, 45, 34);
		reloj2.mostrarReloj();

	}

}
