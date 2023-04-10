package ar.edu.adminpuerta.dominio;

public class Cerradura {

	private int clave;
	private boolean estado;
	
	public Cerradura (int clave){
		this.clave=clave;
		this.estado=false;
	}
	
	
	public boolean abrir (int clave) {
		
		if (this.clave==clave) {
			this.estado=true;
		}
		return this.estado;
	}
	public void cerrar () {
		this.estado=false;
	}
	public boolean consultarEstado(){
		return this.estado;
	}
	public void cambiarClave (int claveNueva) {
		this.clave=claveNueva;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public int getClave() {
		return clave;
	}

	public boolean getEstado() {
		return estado;
	}
	
	
}
