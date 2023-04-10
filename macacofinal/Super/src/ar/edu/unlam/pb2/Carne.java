package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private Double kilos;

	public Carne(Integer codigo, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos,
			String marca, Double precio) {
		super(codigo, descripcion, marca, precio, fechaDeElaboracion, fechaDeVencimiento);
		this.kilos = kilos;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double kilos) {
		this.kilos = kilos;
	}
}
