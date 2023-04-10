package ar.edu.unlam.pb2.eva03;

public class Acuatico extends Vehiculo {
	private Double profundidad;

	public Acuatico(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.profundidad = 0.0;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	
	
}
