package ar.edu.figuras;

public class Rectangulo extends Figura {

	private int lado1;
	private int lado2;

	public Rectangulo(String color, int lado1, int lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String imprimirFigura() {
		return "soy un rectangulo de color: " + super.getColor();
	}
	
	@Override
	public double calcularArea() {
		float area;
		area=lado1*lado2;
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		float perimetro;
		perimetro=2*(lado1+lado2);
		return perimetro;
	}
}
