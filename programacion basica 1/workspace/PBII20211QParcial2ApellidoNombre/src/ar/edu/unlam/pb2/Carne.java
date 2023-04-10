package ar.edu.unlam.pb2;

public class Carne extends Comestible {
	private Double kilos;

	public Carne(int cod, String descripcion, String f1, String f2, Double kilos, String marca, Double precio) {
		super.setCodigo(cod);
		super.setDescripcion(descripcion);
		super.setFechaDeElaboracion(f1);
		super.setFechaDeVencimiento(f2);
		this.kilos = kilos;
		super.setMarca(marca);
		super.setPrecio(precio);
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}

}
