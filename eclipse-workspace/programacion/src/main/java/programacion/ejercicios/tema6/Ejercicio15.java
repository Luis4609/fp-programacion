package programacion.ejercicios.tema6;

public class Ejercicio15 {

	/**
	 * @param nombres[] buscar la primera ves que aparece buscado
	 * @param buscado
	 * @param ordenada
	 * @return
	 */
	public int buscarNombre(String nombres[], String buscado, boolean ordenada) {

		int resultado = 0;
		// Si ordenada == true
		if (ordenada == true) {
			// Recorrer el array nombres
			for (int i = 0; i < nombres.length; i++) {
				// Encontrar si buscado se encuentra en nombres
				if (nombres[i].equalsIgnoreCase(buscado)) {
					return resultado = i;
				}
			}
			resultado = -1;

		} // Ordenada == false
		else {
			for (int j = nombres.length; j > 0; j--) {
				if (nombres[j].equalsIgnoreCase(buscado)) {
					return resultado = j;
				}
			}

			resultado = -1;
		}

		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
