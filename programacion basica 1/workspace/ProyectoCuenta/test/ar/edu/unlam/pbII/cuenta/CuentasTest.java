package ar.edu.unlam.pbII.cuenta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuentasTest {

	@Test
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
//		para CC
		CuentaCorriente cc1 = new CuentaCorriente(11222333, 0.0, 100.0);
		cc1.depositarDinero(100.0);
		cc1.extraerDinero(200.0); // no puede extraer supera saldo + descubierto
		cc1.depositarDinero(200.0);
		assertEquals(300.0, cc1.getSaldo(), 0);
	}

}
