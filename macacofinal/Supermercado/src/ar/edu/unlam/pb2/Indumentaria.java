package ar.edu.unlam.pb2;

public class Indumentaria extends Producto {
	private String talle;
	private String color;

	public Indumentaria(Integer codigo, String descripcion, String marca, Double precio, String talle, String color) {
		super(codigo, descripcion, marca, precio);
		this.talle = talle;
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
