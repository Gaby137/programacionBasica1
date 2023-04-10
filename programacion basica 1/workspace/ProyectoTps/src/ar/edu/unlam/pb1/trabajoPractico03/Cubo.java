package ar.edu.unlam.pb1.trabajoPractico03;

public class Cubo {
	private float longitudLado;
	
	public Cubo (float lado) {
		this.longitudLado=lado;
	}

	public float getLongitudLado() {
		return this.longitudLado;
	}

	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}
	public float getSuperficieCara() {
		return this.longitudLado*4;
	}
	public float getVolumen() {
		return this.longitudLado*this.longitudLado*this.longitudLado;
	}
}
