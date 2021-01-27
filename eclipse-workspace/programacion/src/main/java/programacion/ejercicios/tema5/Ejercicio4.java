package programacion.ejercicios.tema5;

public class Ejercicio4 {

	public int contarCifras(int n) {

		return Integer.toString(n).length();
	}

	public static void main(String[] args) {

		Ejercicio4 num = new Ejercicio4();

		System.out.println(num.contarCifras(43242));

	}

}
