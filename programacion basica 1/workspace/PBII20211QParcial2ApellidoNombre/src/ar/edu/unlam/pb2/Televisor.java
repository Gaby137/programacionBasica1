package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {
	private Integer pulgadas;

	public Televisor(Integer cod, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		this.pulgadas = pulgadas;
		super.setGarantia(garantia);
		super.setMarca(marca);
		super.setPrecio(precio);
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}
}
