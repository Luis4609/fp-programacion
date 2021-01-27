package programacion.ejercicios.punto;

public class Punto {

	// propiedades, que serán las coordenadas del punto
	private double coordX;
	private double coordY;

	// constructor sin parámetros
	public Punto() {
		coordX = coordY = 0.0;
	}

	// constructor con parámetros
	public Punto(double x, double y) {
		coordX = x;
		coordY = y;
	}

	// métodos getXxx y setXxx
	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}

	// método para devolver en un solo string las coordenadas del punto
	public String infoPunto() {
		return "Posición X  :" + this.coordX + " / Posición Y:  " + this.coordY;
	}

	// método para calcular la distancia con otro punto cuyas coordenadas nos pasan
	// como parámetros
	public double calcularDistancia(double x, double y) {

		return Math.sqrt(Math.pow(this.coordX - x, 2) + Math.pow(this.coordY - y, 2));
	}

	// método para calcular la distancia de nuestro punto al origen de coordenadas
	public double calcularDistanciaAOrigen() {
		// reutilizo lo que ya tengo: no es necesario hacer otro cálculo
		return calcularDistancia(0, 0);
		/*
		 * Si hubiese querido calcularlo de nuevo , la fórmula habría sido: Math.sqrt(
		 * Math.pow(this.coordX,2) + Math.pow(this.coordY,2))
		 */

	}

	// Bonus...
	// por último, sobrecargamos el método distancia para pasarle directamente un
	// punto p
	// aquí estoy sobrecargando el método "distancia", pasándole ahora un punto como
	// parámetro
	public double calcularDistancia(Punto p) {

		return Math.sqrt(Math.pow(this.coordX - p.getCoordX(), 2) + Math.pow(this.coordY - p.getCoordY(), 2));
	}

}
