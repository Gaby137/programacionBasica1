package herencia;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void test() {
		Gerente g1 = new Gerente("nombre", "apellido", new Date(1, 1, 2021), (double) 1000, "rrhh", new Cochera());
		
		
		assertEquals(g1.calcularSueldo(), 1000,0);
	}

}
