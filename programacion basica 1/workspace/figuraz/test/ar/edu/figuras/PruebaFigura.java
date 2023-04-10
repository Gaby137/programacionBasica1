package ar.edu.figuras;

public class PruebaFigura {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo("verde", 5, 10);
		System.out.println(r1.imprimirFigura());
		System.out.println("El area es: " + r1.calcularArea() + "  El perimetro es: " + r1.calcularPerimetro());

		Circulo c1 = new Circulo("Naranja", 5);
		System.out.println(c1.imprimirFigura());
		System.out.println("El area es: " + c1.calcularArea() + "  El perimetro es: " + c1.calcularPerimetro());

		Cuadrado c2 = new Cuadrado("azul", 2);
		System.out.println(c2.imprimirFigura());
		System.out.println("El area es: " + c2.calcularArea() + "  El perimetro es: " + c2.calcularPerimetro());

	}
}
