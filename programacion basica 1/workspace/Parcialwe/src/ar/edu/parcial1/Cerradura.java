package ar.edu.parcial1;

public class Cerradura {
	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estadoDeLaCerradura;
	private Integer intentosExitosos;
	private Integer intentosFallidos;

	public Cerradura(Integer claveDeApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estadoDeLaCerradura = false;
		this.intentosExitosos = 0;
		this.intentosFallidos = 0;
	}

	public void abrir(Integer clave) {
		if (this.claveDeApertura.equals(clave)) {
			this.estadoDeLaCerradura = true;
			this.intentosExitosos++;
		} else {
			this.intentosFallidos++;
		}

	}

	public void cerrar() {
		this.estadoDeLaCerradura = false;
	}

	public Boolean estaAbierta() {
		Boolean abierto = false;
		if (this.estadoDeLaCerradura.equals(true)) {
			abierto = true;
		}
		return abierto;
	}

	public Boolean estaCerrada() {
		Boolean cerrado = false;
		if (this.estadoDeLaCerradura.equals(false)) {
			cerrado = true;
		}
		return cerrado;
	}

	public Boolean fueBloqueada() {
		Boolean bloqueado = false;
		if (this.intentosFallidos.equals(this.cantidadDeFallosConsecutivosQueLaBloquean)) {
			bloqueado = true;
		}
		return bloqueado;
	}

	public Integer contarAperturasExitosas() {
		return this.intentosExitosos;
	}

	public Integer contarAperturasFallidas() {
		return this.intentosFallidos;
	}
}
