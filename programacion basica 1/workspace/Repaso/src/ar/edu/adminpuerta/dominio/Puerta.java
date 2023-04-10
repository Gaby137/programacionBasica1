package ar.edu.adminpuerta.dominio;

public class Puerta {

	private boolean estado;
	private String color;
	private Cerradura cerradura;
	
	public Puerta() {
		
	}

	public Puerta( String color, Cerradura cerradura) {
		this.estado = false;
		this.color = color;
		this.cerradura = cerradura;
	}
	
	public Puerta (String color, int clave) {
	this.color=color;
	this.cerradura= new Cerradura (clave);
	}
	
	public boolean verEstadoPuerta() {
		return cerradura.getEstado();
	}
	
	public boolean abrir(int clave) {
		return cerradura.abrir(clave);
		
	}
}
