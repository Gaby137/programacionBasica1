package ar.edu.unlam.pb1.trabajoPractico03;

public class Nota {
	private float valor;
		
	public Nota(float valorInicial) {
		this.valor = valorInicial;
	}
	public float getValor () {
		return this.valor;
	}
	public boolean aprobado() {
		if (this.valor>=7)
			return true;
		else
			return false;
	} 
	public void recuperar (float nuevoValor) {
		
			this.valor = nuevoValor;
	}
		
}
