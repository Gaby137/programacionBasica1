package ar.edu.colection;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Usuario> {

	@Override
	public int compare(Usuario o1, Usuario o2) {
		// TODO Auto-generated method stub
		return o1.getEdad().compareTo(o2.getEdad());
	}

}
