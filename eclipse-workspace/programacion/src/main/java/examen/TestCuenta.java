package examen;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCuenta {

	@Test
	public void testSaldoCuenta() {

		Cuenta testCuenta = new Cuenta(1, "Pepe", "Perez");
		testCuenta.setSaldoCuenta(10000);

		assertTrue(testCuenta.getSaldoCuenta() == 10000);
	}

	@Test
	public void testId() {

		Cuenta testCuenta = new Cuenta(1, "Pepe", "Perez");
		testCuenta.setSaldoCuenta(10000);

		assertTrue(testCuenta.getId() == 1);
	}

	@Test
	public void testTransferencia() {

		Cuenta testCuenta = new Cuenta(1, "Pepe", "Perez");
		testCuenta.setSaldoCuenta(10000);

		Cuenta recibirTransferencia = new Cuenta(2, "Luis", "Perez");
		recibirTransferencia.setSaldoCuenta(1000000);

		testCuenta.transferencia(recibirTransferencia, 1000);

//		assertTrue(testCuenta.getSaldoCuenta() == 9000);
		assertTrue(recibirTransferencia.getSaldoCuenta() == 1001000);
	}
	
	@Test
	public void testTransferenciaSinFondo() {
		
		Cuenta cuenta = new Cuenta(4, "Pepepe", "Pepepepe");
		cuenta.ingresoCuenta(10);
		
		Cuenta recibir = new Cuenta(5, "OtroPepe", "PEPEPEPEP");
		
//		cuenta.transferenciaMetodos(recibir, 100);
		cuenta.transferencia(recibir, 1000);
		recibir.ingresoCuenta(200);
		
		assertTrue(recibir.getSaldoCuenta() == 200);
	}
	
	@Test
	public void testApellido() {

		Cuenta testCuenta = new Cuenta(1, "Pepe", "Perez");
		testCuenta.setSaldoCuenta(10000);

		assertTrue(testCuenta.getApellidoTitular() == "Perez");
	}
	
	
}
