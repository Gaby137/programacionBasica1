package ar.edu.wea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class UnidadAlmacenamiento {
	private Set<Archivo> archivos;
	private Double capacidadMaxima;
	private Character letra;
	private Double cantGrabada;

	public void agregarArchivo(Archivo archivo) throws CapacidadExcedidaException {
		if (archivo.getTamanio() < this.capacidadMaxima) {
			archivos.add(archivo);
			cantGrabada += archivo.getTamanio();
		} else {
			throw new CapacidadExcedidaException("El archivo se excedio de tamanio");
		}
	}

	public Set<Archivo> obtenerListaDeArchivosTipoJpgOrdenadosPorNombre() {
		Set<Archivo> archivosFiltrado = new HashSet<>();

		List<Archivo> listaOrdNombre = new ArrayList<>();
//		listaOrdNombre.addAll(archivos);

		for (Archivo archivo : archivos) {
			if (archivo.getExtension().equals("jpg")) {
				listaOrdNombre.add(archivo);
			}
		}
		listaOrdNombre.sort(new OrdenarPorNombre());
		archivosFiltrado.addAll(listaOrdNombre);

		return archivosFiltrado;

	}

	public Double calcularEspacioAlmacenado() {
		return cantGrabada;
	}

	public Set<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(Set<Archivo> archivos) {
		this.archivos = archivos;
	}

	public Double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Character getLetra() {
		return letra;
	}

	public Double getCantGrabada() {
		return cantGrabada;
	}

	public void setCantGrabada(Double cantGrabada) {
		this.cantGrabada = cantGrabada;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(letra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadAlmacenamiento other = (UnidadAlmacenamiento) obj;
		return Objects.equals(letra, other.letra);
	}

	@Override
	public String toString() {
		return "UnidadAlmacenamiento [archivos=" + archivos + ", capacidadMaxima=" + capacidadMaxima + ", letra="
				+ letra + "]";
	}

}
