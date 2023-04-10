package ar.edu.wea;

import java.util.HashSet;

public class DVD extends UnidadAlmacenamiento {
	private Boolean cerrado;

	public DVD(Character letra, Double capacidadMaxima) {
		super.setArchivos(new HashSet<>());
		super.setLetra(letra);
		super.setCapacidadMaxima(capacidadMaxima);
		super.setCantGrabada(0.0);
		this.cerrado = true;
	}

	public void agregarArchivo(Archivo archivo) {
		if (cerrado.equals(false)) {
			super.getArchivos().add(archivo);
			Double result = super.getCantGrabada();
			result += archivo.getTamanio();
			super.setCantGrabada(result);
		}

	}

	public Boolean getCerrado() {
		return cerrado;
	}

	public void setCerrado(Boolean cerrado) {
		this.cerrado = cerrado;
	}

	public void abrir() {
		this.cerrado = false;
	}

}
