package programacion.ejercicios.tema5;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Ejercicio9 {
	
	public static void main (String args[]) {
		   try {
		     SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
		     
		     for (int i = 0; i < 14; i++) {
		       System.out.print(number.nextInt(3));
		     }
		   } catch (NoSuchAlgorithmException nsae) { 
		    
		   }
	}
	
}
	

	


