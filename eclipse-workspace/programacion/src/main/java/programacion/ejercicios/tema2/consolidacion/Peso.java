/**
 * 
 */
package programacion.ejercicios.tema2.consolidacion;

enum TiposPeso {
	LIBRAS, ONZAS, GRAMOS, KILOS;
}

/**
 * @author Vespertino
 *
 */
public class Peso {

	private double libras;
	private double onzas;
	private double gramos;
	private double kilos;
	private TiposPeso peso;

	/**
	 * @param libras
	 * @param onzas
	 * @param gramos
	 * @param kilos
	 * @param peso
	 */
	public Peso(double libras, double onzas, double gramos, double kilos, TiposPeso peso) {
		super();
		this.libras = libras;
		this.onzas = onzas;
		this.gramos = gramos;
		this.kilos = kilos;
		this.peso = peso;
	}

	/**
	 * Constructor para pasar un peso con su unidad
	 */
	public Peso() {
		super();
		
		if(getKilos() != 0) {
			peso = peso.KILOS;
		}
		if(getGramos() != 0) {
			peso = peso.GRAMOS;
		}
		if(getLibras() != 0) {
			peso = peso.LIBRAS;
		}
		if(getOnzas() != 0) {
			peso = peso.ONZAS;
		}
		else{
			throw new RuntimeException("No se ha introducido ningun peso");
		}
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
	 * @return the onzas
	 */
	public double getOnzas() {
		return onzas;
	}

	/**
	 * @param onzas the onzas to set
	 */
	public void setOnzas(double onzas) {
		this.onzas = onzas;
	}

	/**
	 * @return the gramos
	 */
	public double getGramos() {
		return gramos;
	}

	/**
	 * @param gramos the gramos to set
	 */
	public void setGramos(double gramos) {
		this.gramos = gramos;
	}

	/**
	 * @return the kilos
	 */
	public double getKilos() {
		return kilos;
	}

	/**
	 * @param kilos the kilos to set
	 */
	public void setKilos(double kilos) {
		this.kilos = kilos;
	}

	/**
	 * @return the peso
	 */
	public TiposPeso getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(TiposPeso peso) {
		this.peso = peso;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
