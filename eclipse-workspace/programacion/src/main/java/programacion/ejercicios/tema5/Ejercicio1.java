package programacion.ejercicios.tema5;

public class Ejercicio1 {

	/**
	 * Sumar los numeros pares hasta N
	 * @param n mayor numero
	 * @return resultado
	 */
	public long sumaPares(long n) {

		long resultado = 0;
		for(int i = 0; i <= n; i++) {
			if(i%2 == 0 && i != 0) {
					resultado = resultado + i;
			}
		}
		
		return resultado;

	}

	public static void main(String[] args) {
	
		Ejercicio1 demo = new Ejercicio1();
		System.out.println(demo.sumaPares(10));
		

	}

}
