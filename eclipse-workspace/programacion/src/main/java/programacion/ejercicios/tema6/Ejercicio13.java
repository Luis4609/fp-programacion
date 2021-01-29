package programacion.ejercicios.tema6;

//6. La varianza (que es la media aritmética del cuadrado de las desviaciones de cada

//número respecto de la media aritmética) 

//La moda es el valor que aparece repetido el mayor número de veces. Si hay varios
//valores que aparecen el mismo número de veces, se devolverá el más pequeño.
//Para su cálculo, puede ser útil desarrollar un método auxiliar que cuente cuántas veces se
//repite un número en una lista (la frecuencia de apariciones)
//int contarFrecuencia (double [] lista, double numero), que devolverá el número de veces
//que “número” aparece en la lista
//Una vez obtenida la media aritmética, la varianza se puede calcular con la siguiente
//fórmula:
//∑(xi
//)
//2
//N
//−(x)
//2
//en donde x representa la media aritmética. Lo más cómodo para calcularla reutilizar los
//métodos que hemos desarrollado en los ejercicios 4 y 6 de esta colección.
//Por ejemplo, si tenemos los números {2, 3, 4, 5}:
//x = 14/4= 3,5
// ∑(xi
//)
//2
// = 22
// + 32+ 42+ 52
// = 4+ 9+16+25=54
//∑(xi
//)
//2
//N
//= 54 /4 = 13,5
//Varianza = 27 – 3,52 = 27- 12,25 = 14,75
// Firma del método: double [] estadisticaLista(double [] lista)

public class Ejercicio13 {

	public double[] estadisticaList(double[] lista) {

		// Crear array resultado
		double[] resultado = new double[6];
		// Variables
		int contadorArray = 0; // El contador de valores en la lista, es igual a lista.length si suponemos que
								// la lista esta completa y ninguno es null
		double minNum = 0;
		double maxNum = 0;
		double modaArray = 0;
		double mediaArray = 0;
		double varianzaArray = 0;

		// Realizar los calculos

		if (lista != null) {
			for (int i = 0; i < lista.length; i++) {
				// Obtener contadorArray
				contadorArray++;
				// Obtener minNum
				if (lista[i] < minNum) {
					minNum = lista[i];
				}
				// Obtener maxNum
				if (lista[i] > maxNum) {
					maxNum = lista[i];
				}

			}
			// Calcular la moda
			int maximaVecesQueSeRepite = 0;

			for (int i = 0; i < lista.length; i++) {
				int vecesQueSeRepite = 0;
				for (int j = 0; j < lista.length; j++) {
					if (lista[i] == lista[j])
						vecesQueSeRepite++;
				}
				if (vecesQueSeRepite > maximaVecesQueSeRepite) {
					modaArray = lista[i];
					maximaVecesQueSeRepite = vecesQueSeRepite;
				}
			}
			
//			//Calcular la media
//			for(int i = 0; i <)
		}

		// Construir resultado
		resultado[0] = contadorArray;
		resultado[1] = minNum;
		resultado[2] = maxNum;
		resultado[3] = modaArray;
		resultado[4] = mediaArray;
		resultado[5] = varianzaArray;

		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
