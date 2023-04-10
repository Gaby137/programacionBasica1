package ar.edu.unlam.pb2.eva02;

import java.util.Objects;

public class Anfibio extends Vehiculo {

	private Double velocidad;
	private Double profundidad;

	public Anfibio(Integer codigo, String modelo) {
		super(codigo, modelo);
		this.velocidad = 0.0;
		this.profundidad = 0.0;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public int hashCode() {

		int result = super.hashCode();

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anfibio other = (Anfibio) obj;
		return Objects.equals(super.getCodigo(), other.getCodigo());
	}

}
