package ar.edu.figuras;

public class Circulo extends Figura {
	private float radio;

	public Circulo(String color, float radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public String imprimirFigura() {
		return "soy un circulo de color: " + super.getColor();
	}

	@Override
	public double calcularArea() {
		double area;
		area = Math.pow(Math.PI, 2);
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro;
		perimetro = (2 * Math.PI * radio);
		return perimetro;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

}
