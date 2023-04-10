package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {
	private Integer talle;

	public Zapatilla(int cod, String descripcion, Integer talle, String marca, String color, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		this.talle = talle;
		super.setMarca(marca);
		super.setColor(color);
		super.setPrecio(precio);
	}

	public Integer getTalle() {
		return talle;
	}

	public void setTalle(Integer talle) {
		this.talle = talle;
	}

}
