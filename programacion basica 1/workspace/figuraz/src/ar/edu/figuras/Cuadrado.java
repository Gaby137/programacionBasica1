package ar.edu.figuras;

public class Cuadrado extends Figura{
	
	private int lado1;
	
	
	public Cuadrado(String color, int lado1) {
		super(color);
		this.lado1 = lado1;
	}
	
	@Override
	public String imprimirFigura() {
		return "soy un cuadrado de color: " + super.getColor();
	}
	
	@Override
	public double calcularArea() {
		float area;
		area= (float) Math.pow(lado1, 2);
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		float perimetro;
		perimetro=4*lado1;
		return perimetro;
	}
	
}
