package ar.edu.unlam.pb1.trabajoPractico06;

import ar.edu.unlam.pb1.trabajoPractico02.Persona;

public class Ascensor {
	private final int PISO_MAXIMO =10;
	private final int PISO_MINIMO =40;
	private double PESO_MAXIMO =300;
	private int CAPACIDAD_MAXIMA =4;
	private boolean puertaAbierta;
	private boolean sobrecarga;
	private int pisoActual;
	private double pesoActual;
	private int capacidadActual;
	
	public Ascensor() {
	}
	public Ascensor (int capacidadMaxima, double pesoMaximo) {
		this.CAPACIDAD_MAXIMA=capacidadMaxima;
		this.PESO_MAXIMO=pesoMaximo;
	}
	public void ingresar (Persona elQueSube) {
		if (this.pesoActual<=PESO_MAXIMO) {
			this.pesoActual+=elQueSube.getPeso();
		}else
			this.sobrecarga = true;
		
	}
	public void ingresar (double peso) {
		if (this.pesoActual<=PESO_MAXIMO) {
			this.pesoActual+=peso;
		}else
			this.sobrecarga = true;
		
	}
	public void salir (Persona elQueBaja) {
		if (this.pesoActual<=0) {
			this.pesoActual-=elQueBaja.getPeso();
		}
	}
	public void salir (double peso) {
		if (this.pesoActual<=0) {
			this.pesoActual-=peso;
		}
	}
	public void abrirPuerta() {
		if (this.puertaAbierta==false) {
			this.puertaAbierta=true;
		}
		
	}
	public void cerrarPuerta() {
		if (this.puertaAbierta==true) {
			this.puertaAbierta=false;
		}
	}
	public boolean subir() {
		boolean sePudoSubir=false;
		if (puertaAbierta=false && pisoActual<PISO_MAXIMO) {
			this.pisoActual++;
			 sePudoSubir=true;
		}
		return sePudoSubir;
	}
	public boolean bajar() {
		boolean sePudoBajar=false;
		if (puertaAbierta && pisoActual>PISO_MINIMO) {
			pisoActual--;
			sePudoBajar= true;
		}
		return sePudoBajar;
	}
	public int getPisoActual() {
		return (int) pisoActual;
	}
	public boolean irAlPiso(int pisoDeseado) {
		
		while (pisoDeseado > this.pisoActual) {
			this.subir();
			}
		while (pisoDeseado < this.pisoActual) {
			this.bajar();
			}
		
		
		this.pisoActual=pisoDeseado;
		return puertaAbierta;
	}

}
