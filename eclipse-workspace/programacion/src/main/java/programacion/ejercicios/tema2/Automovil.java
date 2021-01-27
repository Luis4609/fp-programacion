/**
 * 
 */
package programacion.ejercicios.tema2;

enum TipoAutomovil {
	MINI, UTILITARIO, FAMILIAR, DEPORTIVO;
}

/**
 * @author Vespertino Declarar La clase Automovil
 *
 */

public class Automovil {

	// Declarar atributos de la clase automovil
	private String modelo;
	private String color;
	private String pintura;
	private TipoAutomovil tipoAutomovil;
	private int anoFabricacion;

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the pintura
	 */
	public String getPintura() {
		return pintura;
	}

	/**
	 * @param pintura the pintura to set
	 */
	public void setPintura(String pintura) {
		this.pintura = pintura;
	}

	/**
	 * @return the tipoAutomovil
	 */
	public TipoAutomovil getTipoAutomovil() {
		return tipoAutomovil;
	}

	/**
	 * @param tipoAutomovil the tipoAutomovil to set
	 */
	public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
		this.tipoAutomovil = tipoAutomovil;
	}

	/**
	 * @return the anoFabricacion
	 */
	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	/**
	 * @param anoFabricacion the anoFabricacion to set
	 */
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	/**
	 * Mostrar por pantalla el modelo y el color del coche
	 */

	private void mostrarModeloColor() {
		System.out.println("El modelo del coche es: " + getModelo());
		System.out.println("El color del coche es: " + getColor());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar la variable mostrarCoche de tipo Automovil
		Automovil mostrarCoche = new Automovil();

		// Setear los valores que salen por pantalla
		mostrarCoche.setModelo("Renault Scenic");
		mostrarCoche.setColor("Azul oscuro");

		// Llamada al metodo mostrarModeloColor para sacar por pantalla los datos
		mostrarCoche.mostrarModeloColor();

	}

}
