/**
 * 
 */
package programacion.ejercicios.tema2;

/**
 * @author Vespertino
 *
 */
public class TestUtilidades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DiasSemana diasLaborables = DiasSemana.Lunes;
		ColoresPrimarios colores = ColoresPrimarios.verde;
		Idiomas idiomas = Idiomas.italiano;
		TipoDocumentos tipoDocumentos = TipoDocumentos.Pasaporte;

		System.out.println("Mi dia favorito es: " + diasLaborables.name());
		System.out.println("Mi color favorito es: " + colores.name());
		System.out.println("Este año voy a estudiar: " + idiomas.name());
		System.out.println("En las proximas elecciones votare con el : " + tipoDocumentos.name());

	}

}
