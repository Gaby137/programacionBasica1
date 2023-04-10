package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {
	private String talle;

	public Remera(int cod, String descripcion, String talle, String marca, String color, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		this.talle = talle;
		super.setMarca(marca);
		super.setColor(color);
		super.setPrecio(precio);
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

}
