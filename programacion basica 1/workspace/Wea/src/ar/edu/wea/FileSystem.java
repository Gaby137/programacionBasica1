package ar.edu.wea;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FileSystem {
	private Set<UnidadAlmacenamiento> unidades;

	public List<Character> obtenerListaDeUnidadesDeDiscoRigidos() {
		List<Character> l = new ArrayList<>();
		for (UnidadAlmacenamiento unidadAlmacenamiento : unidades) {
			l.add(unidadAlmacenamiento.getLetra());
		}
		return l;
	}
}
