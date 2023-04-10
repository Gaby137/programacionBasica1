package ar.edu.unlam.pb1.trabajoPractico02;
import java.lang.Math;
public class DiscoRigido {
	private int tamanio;
	public static final double TAMANIO_DVD = 4.5;
	public static final double TAMANIO_BLUE = 15;
	
	public DiscoRigido(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public int CantidadDvds() {
		double tamanioGB = this.tamanio*1024;
		return (int) Math.floor(tamanioGB/TAMANIO_DVD);
		
	}
	
	public int cantidadBlue() {
		double tamanioGB = this.tamanio*1024;
		return (int )Math.floor(tamanioGB/TAMANIO_BLUE);
	
	}
}
