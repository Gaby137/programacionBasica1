package ar.edu.unlam.pb1.trabajoPractico09;

public class Jugador {
	private String nombre;
	private String palabra;
	private int vidaActual;
	private static final int CANT_VIDA= 6;
	private char[] palabraPorAdivinar;
	private String letrasFallidas;
	private String letraAcertadas;
	
	public Jugador (String nombre, String palabra) {
		this.nombre=nombre;
		this.palabra=palabra;
		this.vidaActual=CANT_VIDA;
		this.palabraPorAdivinar	= new char[this.palabra.length()];
		for (int i = 0; i < palabraPorAdivinar.length; i++) {
			palabraPorAdivinar[i] ='_';
		}
		this.letrasFallidas = "";
		this.letraAcertadas = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}
	
	public boolean adivinarPalabra (char letra) {
		boolean encontro=false;
		char[] cad=palabra.toCharArray();
		for (int i = 0; i < cad.length; i++) {
			if (letra==cad[i]) {
				this.palabraPorAdivinar[i]=letra;
				this.letraAcertadas.concat(new String(String.valueOf(letra)));
				encontro=true;
			
			}else {
				
				this.letrasFallidas.concat(new String(String.valueOf(letra)));
			
			}
				
		}
		return encontro;
	}
	
	public String toString() {
		String palabra = new String(this.palabraPorAdivinar);
		String estado = palabra+
						"\nCantidad de vidas:"+this.vidaActual+
						"\nLetrasFallidas:"+this.letrasFallidas;
		
		
		return estado;
	}
}