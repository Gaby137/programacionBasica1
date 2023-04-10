package ar.edu.central;

import java.util.HashSet;
import java.util.Set;

public class CentralDeAlarma {

	private String nombre;
	private Set<Alarma> listaAlarmas;
	private Set<Usuario> listaUsuariosCentral;

	public CentralDeAlarma(String nombre) {
		super();
		this.nombre = nombre;
		this.listaAlarmas = new HashSet<>();
		this.listaUsuariosCentral = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alarma> getListaAlarmas() {
		return listaAlarmas;
	}

	public void setListaAlarmas(Set<Alarma> listaAlarmas) {
		this.listaAlarmas = listaAlarmas;
	}

	public Set<Usuario> getListaUsuariosCentral() {
		return listaUsuariosCentral;
	}

	public void setListaUsuariosCentral(Set<Usuario> listaUsuariosCentral) {
		this.listaUsuariosCentral = listaUsuariosCentral;
	}

}
