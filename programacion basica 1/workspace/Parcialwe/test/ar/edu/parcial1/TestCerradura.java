package ar.edu.parcial1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCerradura {

	@Test
	public void queUnaCerraduraNuevaEsteCerrada() {
		Cerradura c1 = new Cerradura(1234, 5);

		assertTrue(c1.estaCerrada());
	}

	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra() {
		Cerradura c2 = new Cerradura(1234, 3);
		c2.abrir(1234);
		assertTrue(c2.estaAbierta());
	}

	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra() {
		Cerradura c3 = new Cerradura(1234, 3);
		c3.abrir(1234);
		assertTrue(c3.estaCerrada());
	}
}
