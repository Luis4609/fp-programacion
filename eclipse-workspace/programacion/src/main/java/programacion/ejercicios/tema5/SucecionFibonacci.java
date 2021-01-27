package programacion.ejercicios.tema5;

public class SucecionFibonacci {

	private int tamaño;
	private String nombre;

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SucecionFibonacci() {
	}

	public SucecionFibonacci(String nombre, int tamaño) {
		this.nombre = nombre;
		this.tamaño = tamaño;
	}

	public int fibonacci(int n) {
		if (n > 1) {
			return fibonacci(n - 1) + fibonacci(n - 2); // función recursiva
		} else if (n == 1) { // caso base
			return 1;
		} else if (n == 0) { // caso base
			return 0;
		} else { // error
			System.out.println("Debes ingresar un tamaño mayor o igual a 1");
			return -1;
		}
	}

	public void mostrarSerie() {

		System.out.println(this.nombre + " de tamaño " + this.tamaño + ":");

		for (int i = 0; i < tamaño; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		SucecionFibonacci f1 = new SucecionFibonacci("fibonacci 1", 10);
		f1.mostrarSerie();

	}

}
