package ar.edu.wea;

import java.util.Objects;

public class Archivo {
	private String nombre;
	private String extension;
	private Double tamanio;

	public Archivo(String nombre, String extension, Double tamanio) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(extension, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Archivo other = (Archivo) obj;
		return Objects.equals(extension, other.extension) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", extension=" + extension + "]";
	}

}
