/**
 * 
 */
package programacion.ejercicios.tema2;

enum TipoDocumentos {
	DNI, Pasaporte, PermisoConducir;

}

enum Idiomas {
	ingles, aleman, frances, italiano, espanol;

}

enum ColoresPrimarios {
	rojo, azul, verde;
}

enum DiasSemana {
	Lunes, Martes, Miercoles, Jueves, Viernes;
}

/**
 * @author Vespertino
 *
 */
public class Utilidades {

	private DiasSemana diasLaborables;
	private ColoresPrimarios colores;
	private Idiomas idiomas;
	private TipoDocumentos tipoDocumentos;

	/**
	 * @return the diasLaborables
	 */
	public DiasSemana getDiasLaborables() {
		return diasLaborables;
	}

	/**
	 * @param diasLaborables the diasLaborables to set
	 */
	public void setDiasLaborables(DiasSemana diasLaborables) {
		this.diasLaborables = diasLaborables;
	}

	/**
	 * @return the colores
	 */
	public ColoresPrimarios getColores() {
		return colores;
	}

	/**
	 * @param colores the colores to set
	 */
	public void setColores(ColoresPrimarios colores) {
		this.colores = colores;
	}

	/**
	 * @return the idiomas
	 */
	public Idiomas getIdiomas() {
		return idiomas;
	}

	/**
	 * @param idiomas the idiomas to set
	 */
	public void setIdiomas(Idiomas idiomas) {
		this.idiomas = idiomas;
	}

	/**
	 * @return the tipoDocumentos
	 */
	public TipoDocumentos getTipoDocumentos() {
		return tipoDocumentos;
	}

	/**
	 * @param tipoDocumentos the tipoDocumentos to set
	 */
	public void setTipoDocumentos(TipoDocumentos tipoDocumentos) {
		this.tipoDocumentos = tipoDocumentos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
