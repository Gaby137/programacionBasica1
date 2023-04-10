package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	private Boolean noFrost;

	public Heladera(Integer cod, String descripcion, Boolean noFrost, Integer garantia, String marca, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		this.noFrost = noFrost;
		super.setGarantia(garantia);
		super.setMarca(marca);
		super.setPrecio(precio);

	}

	public Boolean getNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}

	public Boolean isNoFrost() {
		return noFrost;
	}
}
