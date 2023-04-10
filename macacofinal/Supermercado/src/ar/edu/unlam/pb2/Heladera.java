package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	private Boolean noFrost;

	public Heladera(Integer codigo, String descripcion, Boolean noFrost, Integer garantia, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio, garantia);
		this.noFrost = noFrost;
	}

	public Boolean getNoFrost() {
		return noFrost;
	}

	public void setNoFrost(Boolean noFrost) {
		this.noFrost = noFrost;
	}

}
