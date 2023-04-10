package ar.edu.unlam.pb1.trabajoPractico03;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int contadorDeIntentosFallidos;
	private boolean puerta = false;
	
	
	public Cerradura (int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura=claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean=cantidadDeFallosConsecutivosQueLaBloquean;
		this.contadorDeIntentosFallidos=0;
	}
	
	public String toString() {
		return "la puerta esta "+ estaAbierta();
	}
	
	public boolean abrir (int clave) {
		if (fueBloqueada()) {
			return false;
		}
		if (this.claveDeApertura==clave) {
			this.puerta = true;
			return true;
		} else {
				contadorDeIntentosFallidos++;
				return false;
		}
	}
	public void cerrar() {
		if (this.puerta== true) {
			this.puerta = !puerta;
		}
	}
	public boolean estaAbierta() {
		return this.puerta;
	}
	public boolean fueBloqueada() {
		if (this.contadorDeIntentosFallidos >= cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		} else {
			return false;
		}
	}
	
}

