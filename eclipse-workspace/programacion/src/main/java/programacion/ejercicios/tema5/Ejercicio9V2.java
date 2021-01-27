package programacion.ejercicios.tema5;
import java.security.SecureRandom;


public class Ejercicio9V2 {

    public static String apostarQuiniela() {
        SecureRandom secureRandom = new SecureRandom();
        String resultado = null;
        String espacio = " - ";

        for(int i = 0; i < 14; i++) {
            int num = secureRandom.nextInt(3);

            if(num == 0) {
            	resultado = "X";
            } else {
            	resultado = "" + num;
            }

            if(i < 13) {
                System.out.print(resultado.concat(espacio));
            } else {
                System.out.print(resultado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        apostarQuiniela();
    }

}