package ar.edu.panini;

import java.util.HashSet;
import java.util.Set;

public class Administrador extends Usuario {
	private Set<Figurita> listaDeAltaDeFiguritas;

	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		this.listaDeAltaDeFiguritas = new HashSet<>();
	}

	@Override
	public Boolean agregarFigurita(Figurita figurita) throws CodigoExistente {
		Boolean agregado = false;
		
			
				if (!this.listaDeAltaDeFiguritas.contains(figurita)) {
					this.listaDeAltaDeFiguritas.add(figurita);
					agregado = true;
				}else {
					throw new CodigoExistente("Codigo existente");
				}
			
		
		return agregado;
	}

	public Set<Figurita> getListaDeAltaDeFiguritas() {
		return listaDeAltaDeFiguritas;
	}

	public void setListaDeAltaDeFiguritas(Set<Figurita> listaDeAltaDeFiguritas) {
		this.listaDeAltaDeFiguritas = listaDeAltaDeFiguritas;
	}
	
	
} 
