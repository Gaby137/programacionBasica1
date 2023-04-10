package ar.edu.figuras;

import org.junit.Test;

public class TestPolimorfismo {

	@Test
	public void test() {
		Figura f;
		f = new Circulo("verde", (float) 1.0);
		f.getColor();
		((Circulo) f).getRadio();

		if (f instanceof Figura) {
			System.out.println(f.getColor());

		} else {
			System.out.println(((Circulo) f).getRadio());
		}

	}

}
