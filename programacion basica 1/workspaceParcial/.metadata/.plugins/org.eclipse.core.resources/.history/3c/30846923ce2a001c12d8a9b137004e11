package ar.edu.unlam.pb2.smartwatch.deportista;

public abstract class Deportista {
	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Double alturaActual;
	private Integer pasosDiarios;
	protected Disciplina tipoDeDisciplina;
	
	public Deportista() {

	}

	public Deportista(String nombre, Integer edadActual, Double pesoActual, Double alturaActual) {
		super();
		this.nombre = nombre;
		this.edadActual = edadActual;
		this.pesoActual = pesoActual;
		this.alturaActual = alturaActual;
		this.pasosDiarios = 0;
	}

	


//	public abstract Double distanciaRecorrida(Integer cantidadMovimentos, Double longitud);
	

//	public abstract Double tiempoTrascurrido(Integer cantidadMovimentos);

	public Double distanciaRecorrida(Double double1, Double longitud) {
		Double resultadoEnKm = (double1 * longitud) / 1000;
		return resultadoEnKm;
	}

	public Double tiempoTrascurrido(Double tiempoEnSeg) {
		return tiempoEnSeg;
	}


	public Double calcularElRitmo() {
		return 0.0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdadActual() {
		return edadActual;
	}

	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}

	public double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public double getAlturaActual() {
		return alturaActual;
	}

	public void setAlturaActual(Double alturaActual) {
		this.alturaActual = alturaActual;
	}

	public int getPasosDiarios() {
		return pasosDiarios;
	}

	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}

	public Disciplina getTipoDeDisciplina() {
		return tipoDeDisciplina;
	}

	public void setTipoDeDisciplina(Disciplina tipoDeDisciplina) {
		this.tipoDeDisciplina = tipoDeDisciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alturaActual == null) ? 0 : alturaActual.hashCode());
		result = prime * result + ((edadActual == null) ? 0 : edadActual.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pesoActual == null) ? 0 : pesoActual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		if (alturaActual == null) {
			if (other.alturaActual != null)
				return false;
		} else if (!alturaActual.equals(other.alturaActual))
			return false;
		if (edadActual == null) {
			if (other.edadActual != null)
				return false;
		} else if (!edadActual.equals(other.edadActual))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pesoActual == null) {
			if (other.pesoActual != null)
				return false;
		} else if (!pesoActual.equals(other.pesoActual))
			return false;
		return true;
	}

}
