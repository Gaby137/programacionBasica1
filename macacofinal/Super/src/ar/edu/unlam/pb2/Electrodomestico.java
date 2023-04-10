package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto {

	private Integer garantia;

	public Electrodomestico(Integer codigo, String descripcion, String marca, Double precio, Integer garantia) {
		super(codigo, descripcion, marca, precio);
		this.garantia = garantia;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
