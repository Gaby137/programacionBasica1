package ar.edu.figuras;

public abstract class Figura {
	private String color;

	public Figura() {

	}

	public Figura(String color) {
		this.color = color;
	}

	public String imprimirFigura() {
		return "soy figura de color: " + this.color;
	}

	public abstract double calcularArea();

	public double calcularPerimetro() {
		return 0.0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

}
