package herencia;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class IngenieroTest {

	@Test
	public void test() {
		Ingeniero i1 = new Ingeniero("nombre", "apellido", new Date(1, 1, 2021), (double) 1000, "rrhh", (double) 100);
//		System.out.println(i1.calcularSueldo());
		assertEquals(i1.calcularSueldo(),1100.0, 0.0);
	}

}
