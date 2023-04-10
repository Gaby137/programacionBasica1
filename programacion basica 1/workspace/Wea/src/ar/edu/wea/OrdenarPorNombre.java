package ar.edu.wea;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Archivo> {

	@Override
	public int compare(Archivo o1, Archivo o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
