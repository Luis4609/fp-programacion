package programacion.ejercicios.punto;

public class TestPunto {

	public static void main(String[] args) {

		// declaro los puntos, sin definirlos aún
		Punto p1, p2, p3, p4;

		// defino el primer punto en el origen con el constructor por defecto
		p1 = new Punto();

		// defino los siguientes puntos con las coordenadas que me indican
		p2 = new Punto(1, 5);
		p3 = new Punto(8, 20);

		/*
		 * para el último punto, recordamos que el punto medio tiene como coordenadas el
		 * promedio o media aritmética de las coordenadas de cada punto
		 */
		p4 = new Punto((1 + 8) / 2.0, (5 + 20) / 2.0);

		// ahora compruebo que los puntos se han creado
		System.out.println("\nComprobación de los puntos que he creado");
		System.out.println(p1.infoPunto());
		System.out.println(p2.infoPunto());
		System.out.println(p3.infoPunto());
		System.out.println(p4.infoPunto());

		// hay que probar ahora el método de cálculo de distancias, según lo pedido
		Punto p5 = new Punto(3, 4);
		System.out.println("\nDistancia del punto p5 a los puntos pedidos");
		System.out.format("%nDistancia del punto (3,4) al origen (0,0) : %.4f", p5.calcularDistancia(0, 0));
		System.out.format("%nDistancia del punto (3,4) al punto (-3,-4) : %.4f", p5.calcularDistancia(-3, -4));
		System.out.format("%nDistancia del punto (3,4) al punto (8,20) : %.4f", p5.calcularDistancia(8, 20));

		System.out.println("\nDistancia de varios puntos al origen");
		// ahora voy a calcular la distancia de varios puntos al origen con el método
		// específico
		System.out.format("%nDistancia del punto p1 al origen :  %.4f", p1.calcularDistanciaAOrigen());
		System.out.format("%nDistancia del punto p2 al origen :  %.4f", p2.calcularDistanciaAOrigen());

		// y el bonus: calculo la distancia pasando directamente como parámetro un punto
		System.out.println("\nDistancia entre dos puntos con el método sobrecargado");
		System.out.format("%nDistancia entre p5 y p1 : %.4f", p5.calcularDistancia(p1));
		System.out.format("%nDistancia entre p5 y p1 : %.4f", p1.calcularDistancia(p5));

	} // c'est fini :-D

}
